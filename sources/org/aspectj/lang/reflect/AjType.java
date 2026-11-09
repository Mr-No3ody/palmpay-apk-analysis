package org.aspectj.lang.reflect;

import E.AbstractC0210o;
import Sg.a;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* JADX INFO: loaded from: classes4.dex */
public interface AjType<T> extends Type, AnnotatedElement {
    Advice getAdvice(String str) throws AbstractC0210o;

    Advice[] getAdvice(a... aVarArr);

    AjType<?>[] getAjTypes();

    Constructor getConstructor(AjType<?>... ajTypeArr) throws NoSuchMethodException;

    Constructor[] getConstructors();

    DeclareAnnotation[] getDeclareAnnotations();

    DeclareErrorOrWarning[] getDeclareErrorOrWarnings();

    DeclareParents[] getDeclareParents();

    DeclarePrecedence[] getDeclarePrecedence();

    DeclareSoft[] getDeclareSofts();

    Advice getDeclaredAdvice(String str) throws AbstractC0210o;

    Advice[] getDeclaredAdvice(a... aVarArr);

    AjType<?>[] getDeclaredAjTypes();

    Constructor getDeclaredConstructor(AjType<?>... ajTypeArr) throws NoSuchMethodException;

    Constructor[] getDeclaredConstructors();

    Field getDeclaredField(String str) throws NoSuchFieldException;

    Field[] getDeclaredFields();

    InterTypeConstructorDeclaration getDeclaredITDConstructor(AjType<?> ajType, AjType<?>... ajTypeArr) throws NoSuchMethodException;

    InterTypeConstructorDeclaration[] getDeclaredITDConstructors();

    InterTypeFieldDeclaration getDeclaredITDField(String str, AjType<?> ajType) throws NoSuchFieldException;

    InterTypeFieldDeclaration[] getDeclaredITDFields();

    InterTypeMethodDeclaration getDeclaredITDMethod(String str, AjType<?> ajType, AjType<?>... ajTypeArr) throws NoSuchMethodException;

    InterTypeMethodDeclaration[] getDeclaredITDMethods();

    Method getDeclaredMethod(String str, AjType<?>... ajTypeArr) throws NoSuchMethodException;

    Method[] getDeclaredMethods();

    Pointcut getDeclaredPointcut(String str) throws AbstractC0210o;

    Pointcut[] getDeclaredPointcuts();

    AjType<?> getDeclaringType();

    Constructor getEnclosingConstructor();

    Method getEnclosingMethod();

    AjType<?> getEnclosingType();

    T[] getEnumConstants();

    Field getField(String str) throws NoSuchFieldException;

    Field[] getFields();

    Type getGenericSupertype();

    InterTypeConstructorDeclaration getITDConstructor(AjType<?> ajType, AjType<?>... ajTypeArr) throws NoSuchMethodException;

    InterTypeConstructorDeclaration[] getITDConstructors();

    InterTypeFieldDeclaration getITDField(String str, AjType<?> ajType) throws NoSuchFieldException;

    InterTypeFieldDeclaration[] getITDFields();

    InterTypeMethodDeclaration getITDMethod(String str, AjType<?> ajType, AjType<?>... ajTypeArr) throws NoSuchMethodException;

    InterTypeMethodDeclaration[] getITDMethods();

    AjType<?>[] getInterfaces();

    Class<T> getJavaClass();

    Method getMethod(String str, AjType<?>... ajTypeArr) throws NoSuchMethodException;

    Method[] getMethods();

    int getModifiers();

    String getName();

    Package getPackage();

    PerClause getPerClause();

    Pointcut getPointcut(String str) throws AbstractC0210o;

    Pointcut[] getPointcuts();

    AjType<?> getSupertype();

    TypeVariable<Class<T>>[] getTypeParameters();

    boolean isArray();

    boolean isAspect();

    boolean isEnum();

    boolean isInstance(Object obj);

    boolean isInterface();

    boolean isLocalClass();

    boolean isMemberAspect();

    boolean isMemberClass();

    boolean isPrimitive();

    boolean isPrivileged();
}
