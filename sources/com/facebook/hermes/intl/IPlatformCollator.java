package com.facebook.hermes.intl;

import U2.B;
import U2.EnumC0611b;
import U2.EnumC0612c;

/* JADX INFO: loaded from: classes.dex */
public interface IPlatformCollator {
    int compare(String str, String str2);

    IPlatformCollator configure(ILocaleObject<?> iLocaleObject) throws B;

    String[] getAvailableLocales();

    EnumC0612c getSensitivity();

    IPlatformCollator setCaseFirstAttribute(EnumC0611b enumC0611b);

    IPlatformCollator setIgnorePunctuation(boolean z3);

    IPlatformCollator setNumericAttribute(boolean z3);

    IPlatformCollator setSensitivity(EnumC0612c enumC0612c);
}
