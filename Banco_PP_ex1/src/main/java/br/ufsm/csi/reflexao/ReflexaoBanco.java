package br.ufsm.csi.reflexao;

import br.ufsm.csi.reflexao.MinhaAnnotation;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

public class ReflexaoBanco {
    public ReflexaoBanco() {
    }

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException {
        JFileChooser jfc = new JFileChooser(new File("E:\\PP\\Banco_PP_ex1\\target\\")); //caminho onde está o projeto
        int returnValue = jfc.showOpenDialog(new JFrame());

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = jfc.getSelectedFile();
            JarFile jarFile = new JarFile(selectedFile);
            Enumeration<JarEntry> ent = jarFile.entries();
            URL url = selectedFile.toURI().toURL();
            URLClassLoader child = new URLClassLoader(new URL[]{url}, ReflexaoBanco.class.getClassLoader());

            while (ent.hasMoreElements()) {
                JarEntry jarEntry = (JarEntry) ent.nextElement();
                if (jarEntry.getName().endsWith(".class")) {
                    String classname = jarEntry.getName().replace("/", ".").replace(".class", "");
                    Class classe = Class.forName(classname, true, child);
                    printInfos(classe);
                }
            }

        }
    }

    private static void printInfos(Class classe) {
        System.out.println("\n\n -------------------Reflexão na classe " + classe.getName());
        Field[] var1 = classe.getDeclaredFields();
        int var2 = var1.length;

        int var3;
        String fin;
        String priv;
        String pub;
        String stat;

        for(var3 = 0; var3 < var2; ++var3){
            Field campo = var1[var3];
            fin = Modifier.isFinal(campo.getModifiers()) ? "final " : "";
            priv = Modifier.isPrivate(campo.getModifiers()) ? "private " : "";
            pub = Modifier.isPublic(campo.getModifiers()) ? "public " : "";
            stat = Modifier.isStatic(campo.getModifiers()) ? "static " : "";
            System.out.println("<CAMPO> " + pub + priv + stat + fin + campo.getType().getSimpleName() + " " + campo.getName());
        }

        Method[] var14 = classe.getDeclaredMethods();
        var2 = var14.length;

        for(var3 = 0; var3 < var2; ++var3) {
            Method metodo = var14[var3];
            fin = Modifier.isFinal(metodo.getModifiers()) ? "final " : "";
            priv = Modifier.isPrivate(metodo.getModifiers()) ? "private " : "";
            pub = Modifier.isPublic(metodo.getModifiers()) ? "public " : "";
            stat = Modifier.isStatic(metodo.getModifiers()) ? "static " : "";
            StringBuilder sb = new StringBuilder();
            Class[] var10 = metodo.getParameterTypes();
            int var11 = var10.length;

            for(int var12 = 0; var12 < var11; ++var12) {
                Class tipoParam = var10[var12];
                if (!sb.isEmpty()) {
                    sb.append(", ");
                }

                sb.append(tipoParam.getSimpleName());
            }

            if (metodo.getAnnotation(MinhaAnnotation.class) != null) {
                MinhaAnnotation annot = (MinhaAnnotation) metodo.getAnnotation(MinhaAnnotation.class);
                PrintStream var10000 = System.out;
                String var10001 = annot.nome();
                var10000.println("<METODO> <" + var10001 + "> " + pub + priv + stat + fin + metodo.getReturnType().getSimpleName() + " " + metodo.getName() + "(" + sb + ")");
            }
        }

    }
}