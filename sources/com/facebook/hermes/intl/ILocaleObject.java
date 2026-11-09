package com.facebook.hermes.intl;

import U2.B;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public interface ILocaleObject<T> {
    ILocaleObject<T> cloneObject() throws B;

    T getLocale() throws B;

    T getLocaleWithoutExtensions() throws B;

    ArrayList<String> getUnicodeExtensions(String str) throws B;

    HashMap<String, String> getUnicodeExtensions() throws B;

    void setUnicodeExtensions(String str, ArrayList<String> arrayList) throws B;

    String toCanonicalTag() throws B;

    String toCanonicalTagWithoutExtensions() throws B;
}
