package com.facebook.hermes.intl;

import U2.B;
import U2.EnumC0614e;
import U2.f;
import U2.g;
import U2.h;
import U2.i;
import U2.j;
import U2.k;
import U2.l;
import U2.m;
import U2.n;
import U2.o;
import U2.p;
import U2.q;
import java.text.AttributedCharacterIterator;

/* JADX INFO: loaded from: classes.dex */
public interface IPlatformDateTimeFormatter {
    void configure(ILocaleObject<?> iLocaleObject, String str, String str2, h hVar, p pVar, g gVar, q qVar, l lVar, f fVar, i iVar, k kVar, m mVar, o oVar, j jVar, Object obj, EnumC0614e enumC0614e, n nVar, Object obj2) throws B;

    String fieldToString(AttributedCharacterIterator.Attribute attribute, String str);

    String format(double d2) throws B;

    AttributedCharacterIterator formatToParts(double d2) throws B;

    String[] getAvailableLocales();

    String getDefaultCalendarName(ILocaleObject<?> iLocaleObject) throws B;

    j getDefaultHourCycle(ILocaleObject<?> iLocaleObject) throws B;

    String getDefaultNumberingSystem(ILocaleObject<?> iLocaleObject) throws B;

    String getDefaultTimeZone(ILocaleObject<?> iLocaleObject) throws B;
}
