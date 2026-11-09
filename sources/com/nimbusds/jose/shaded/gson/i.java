package com.nimbusds.jose.shaded.gson;

import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: Enum visitor error
java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.nodes.MethodNode.getBasicBlocks()" is null
	at jadx.core.dex.visitors.EnumVisitor.searchEnumSuperCtrInsn(EnumVisitor.java:495)
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:473)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes3.dex */
public abstract class i implements FieldNamingStrategy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f23623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ i[] f23624b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.nimbusds.jose.shaded.gson.b] */
    static {
        ?? r3 = new i() { // from class: com.nimbusds.jose.shaded.gson.b
            @Override // com.nimbusds.jose.shaded.gson.FieldNamingStrategy
            public final String translateName(Field field) {
                return field.getName();
            }
        };
        f23623a = r3;
        f23624b = new i[]{r3, new i() { // from class: com.nimbusds.jose.shaded.gson.c
            @Override // com.nimbusds.jose.shaded.gson.FieldNamingStrategy
            public final String translateName(Field field) {
                return i.b(field.getName());
            }
        }, new i() { // from class: com.nimbusds.jose.shaded.gson.d
            @Override // com.nimbusds.jose.shaded.gson.FieldNamingStrategy
            public final String translateName(Field field) {
                return i.b(i.a(field.getName(), ' '));
            }
        }, new i() { // from class: com.nimbusds.jose.shaded.gson.e
            @Override // com.nimbusds.jose.shaded.gson.FieldNamingStrategy
            public final String translateName(Field field) {
                return i.a(field.getName(), '_').toUpperCase(Locale.ENGLISH);
            }
        }, new i() { // from class: com.nimbusds.jose.shaded.gson.f
            @Override // com.nimbusds.jose.shaded.gson.FieldNamingStrategy
            public final String translateName(Field field) {
                return i.a(field.getName(), '_').toLowerCase(Locale.ENGLISH);
            }
        }, new i() { // from class: com.nimbusds.jose.shaded.gson.g
            @Override // com.nimbusds.jose.shaded.gson.FieldNamingStrategy
            public final String translateName(Field field) {
                return i.a(field.getName(), '-').toLowerCase(Locale.ENGLISH);
            }
        }, new i() { // from class: com.nimbusds.jose.shaded.gson.h
            @Override // com.nimbusds.jose.shaded.gson.FieldNamingStrategy
            public final String translateName(Field field) {
                return i.a(field.getName(), '.').toLowerCase(Locale.ENGLISH);
            }
        }};
    }

    public static String a(String str, char c6) {
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i7 = 0; i7 < length; i7++) {
            char cCharAt = str.charAt(i7);
            if (Character.isUpperCase(cCharAt) && sb2.length() != 0) {
                sb2.append(c6);
            }
            sb2.append(cCharAt);
        }
        return sb2.toString();
    }

    public static String b(String str) {
        int length = str.length();
        for (int i7 = 0; i7 < length; i7++) {
            char cCharAt = str.charAt(i7);
            if (Character.isLetter(cCharAt)) {
                if (Character.isUpperCase(cCharAt)) {
                    break;
                }
                char upperCase = Character.toUpperCase(cCharAt);
                if (i7 == 0) {
                    return upperCase + str.substring(1);
                }
                return str.substring(0, i7) + upperCase + str.substring(i7 + 1);
            }
        }
        return str;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f23624b.clone();
    }
}
