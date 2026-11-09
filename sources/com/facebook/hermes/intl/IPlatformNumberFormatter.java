package com.facebook.hermes.intl;

import U2.B;
import U2.r;
import U2.s;
import U2.t;
import U2.u;
import U2.v;
import U2.w;
import U2.x;
import U2.y;
import java.text.AttributedCharacterIterator;

/* JADX INFO: loaded from: classes.dex */
public interface IPlatformNumberFormatter {
    IPlatformNumberFormatter configure(ILocaleObject<?> iLocaleObject, String str, x xVar, t tVar, u uVar, r rVar) throws B;

    String fieldToString(AttributedCharacterIterator.Attribute attribute, double d2);

    String format(double d2) throws B;

    AttributedCharacterIterator formatToParts(double d2) throws B;

    String[] getAvailableLocales();

    String getDefaultNumberingSystem(ILocaleObject<?> iLocaleObject) throws B;

    IPlatformNumberFormatter setCurrency(String str, s sVar) throws B;

    IPlatformNumberFormatter setFractionDigits(v vVar, int i7, int i10);

    IPlatformNumberFormatter setGrouping(boolean z3);

    IPlatformNumberFormatter setMinIntergerDigits(int i7);

    IPlatformNumberFormatter setSignDisplay(w wVar);

    IPlatformNumberFormatter setSignificantDigits(v vVar, int i7, int i10) throws B;

    IPlatformNumberFormatter setUnits(String str, y yVar) throws B;
}
