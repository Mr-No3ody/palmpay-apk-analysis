package N2;

import C0.G;
import E.C0212q;
import E.T;
import Td.c;
import U2.B;
import U2.C;
import U2.r;
import U2.s;
import U2.t;
import U2.u;
import U2.v;
import U2.x;
import U2.y;
import android.database.Cursor;
import android.icu.text.CompactDecimalFormat;
import android.icu.text.DecimalFormat;
import android.icu.text.DecimalFormatSymbols;
import android.icu.text.MeasureFormat;
import android.icu.text.NumberFormat;
import android.icu.text.NumberingSystem;
import android.icu.text.UFormat;
import android.icu.util.Currency;
import android.icu.util.Measure;
import android.icu.util.MeasureUnit;
import android.icu.util.ULocale;
import android.util.SparseArray;
import androidx.camera.core.impl.CameraFactory;
import androidx.room.L;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.facebook.common.executors.SerialExecutorService;
import com.facebook.common.references.CloseableReference;
import com.facebook.fresco.animation.backend.AnimationBackend;
import com.facebook.fresco.animation.bitmap.BitmapFrameCache;
import com.facebook.fresco.animation.bitmap.preparation.BitmapFramePreparer;
import com.facebook.hermes.intl.ILocaleObject;
import com.facebook.hermes.intl.IPlatformNumberFormatter;
import com.facebook.imagepipeline.decoder.ImageDecoder;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import com.facebook.imagepipeline.image.QualityInfo;
import com.facebook.imagepipeline.platform.PlatformDecoder;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.transsnet.palmpay.core.db.RequestContactDB_Impl;
import com.transsnet.palmpay.core.db.dao.RequestContactDao;
import com.transsnet.palmpay.core.db.entity.RequestContact;
import java.io.InputStream;
import java.text.AttributedCharacterIterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p109h3.e;
import p109h3.g;
import p140j8.f;

/* JADX INFO: loaded from: classes.dex */
public final class a implements BitmapFramePreparer, IPlatformNumberFormatter, ImageDecoder, RequestContactDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f6064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f6065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f6066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f6067d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f6068e;

    public a(RequestContactDB_Impl database) {
        this.f6064a = database;
        Intrinsics.checkNotNullParameter(database, "database");
        this.f6065b = new Td.a(database, 9);
        Intrinsics.checkNotNullParameter(database, "database");
        this.f6066c = new Td.b(database, 5);
        Intrinsics.checkNotNullParameter(database, "database");
        this.f6067d = new Td.b(database, 6);
        this.f6068e = new c(database, 28);
    }

    public CloseableStaticBitmap a(e eVar, com.facebook.imagepipeline.common.c cVar) {
        CloseableReference closeableReferenceDecodeFromEncodedImageWithColorSpace = ((PlatformDecoder) this.f6067d).decodeFromEncodedImageWithColorSpace(eVar, cVar.f21425a, null, null);
        try {
            closeableReferenceDecodeFromEncodedImageWithColorSpace.getClass();
            g gVar = g.f37290d;
            eVar.k();
            int i7 = eVar.f37276c;
            eVar.k();
            CloseableStaticBitmap closeableStaticBitmapOf = CloseableStaticBitmap.of(closeableReferenceDecodeFromEncodedImageWithColorSpace, gVar, i7, eVar.f37277d);
            closeableStaticBitmapOf.putExtra("is_rounded", Boolean.FALSE);
            closeableReferenceDecodeFromEncodedImageWithColorSpace.close();
            return closeableStaticBitmapOf;
        } catch (Throwable th) {
            CloseableReference.d(closeableReferenceDecodeFromEncodedImageWithColorSpace);
            throw th;
        }
    }

    public LinkedHashSet b() {
        LinkedHashSet linkedHashSet;
        synchronized (this.f6064a) {
            linkedHashSet = new LinkedHashSet(((LinkedHashMap) this.f6065b).values());
        }
        return linkedHashSet;
    }

    public void c(CameraFactory cameraFactory) {
        synchronized (this.f6064a) {
            try {
                for (String str : cameraFactory.getAvailableCameraIds()) {
                    f.G("CameraRepository");
                    ((LinkedHashMap) this.f6065b).put(str, cameraFactory.getCamera(str));
                }
            } catch (C0212q e10) {
                throw new T(e10);
            }
        }
    }

    @Override // com.facebook.hermes.intl.IPlatformNumberFormatter
    public IPlatformNumberFormatter configure(ILocaleObject iLocaleObject, String str, x xVar, t tVar, u uVar, r rVar) throws B {
        if (!str.isEmpty()) {
            try {
                if (NumberingSystem.getInstanceByName(str) == null) {
                    throw new B("Invalid numbering system: ".concat(str), 0);
                }
                ArrayList<String> arrayList = new ArrayList<>();
                arrayList.add(str);
                iLocaleObject.setUnicodeExtensions("nu", arrayList);
            } catch (RuntimeException unused) {
                throw new B("Invalid numbering system: ".concat(str), 0);
            }
        }
        if (uVar == u.f9171c && (xVar == x.f9179a || xVar == x.f9182d)) {
            CompactDecimalFormat compactDecimalFormat = CompactDecimalFormat.getInstance((ULocale) iLocaleObject.getLocale(), rVar == r.f9161a ? CompactDecimalFormat.CompactStyle.SHORT : CompactDecimalFormat.CompactStyle.LONG);
            this.f6065b = compactDecimalFormat;
            this.f6064a = compactDecimalFormat;
            this.f6066c = (C) iLocaleObject;
            this.f6067d = xVar;
            compactDecimalFormat.setRoundingMode(4);
            return this;
        }
        int iOrdinal = xVar.ordinal();
        u uVar2 = u.f9170b;
        int i7 = 2;
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                i7 = (uVar == u.f9169a || uVar == uVar2) ? 3 : 0;
            } else if (tVar == t.f9167b) {
                i7 = 7;
            } else {
                if (tVar != t.f9166a) {
                    throw new B("Unrecognized formatting style requested.", 0);
                }
                i7 = 1;
            }
        }
        NumberFormat numberFormat = NumberFormat.getInstance((ULocale) iLocaleObject.getLocale(), i7);
        if (uVar == uVar2) {
            numberFormat.setMaximumIntegerDigits(3);
        }
        this.f6065b = numberFormat;
        this.f6064a = numberFormat;
        this.f6066c = (C) iLocaleObject;
        this.f6067d = xVar;
        numberFormat.setRoundingMode(4);
        return this;
    }

    @Override // com.facebook.imagepipeline.decoder.ImageDecoder
    public CloseableImage decode(e eVar, int i7, QualityInfo qualityInfo, com.facebook.imagepipeline.common.c cVar) {
        InputStream inputStreamE;
        cVar.getClass();
        eVar.k();
        W2.e eVar2 = eVar.f37275b;
        if ((eVar2 == null || eVar2 == W2.e.f10545c) && (inputStreamE = eVar.e()) != null) {
            eVar.f37275b = W2.g.f10548d.getImageFormat_WrapIOException(inputStreamE);
        }
        return ((Ab.r) this.f6068e).decode(eVar, i7, qualityInfo, cVar);
    }

    @Override // com.transsnet.palmpay.core.db.dao.RequestContactDao
    public int delete(RequestContact requestContact) {
        RequestContactDB_Impl requestContactDB_Impl = (RequestContactDB_Impl) this.f6064a;
        requestContactDB_Impl.assertNotSuspendingTransaction();
        requestContactDB_Impl.beginTransaction();
        try {
            int iE = ((Td.b) this.f6066c).e(requestContact);
            requestContactDB_Impl.setTransactionSuccessful();
            return iE;
        } finally {
            requestContactDB_Impl.endTransaction();
        }
    }

    @Override // com.transsnet.palmpay.core.db.dao.RequestContactDao
    public int deleteContactByMemberId(String str, String str2) {
        RequestContactDB_Impl requestContactDB_Impl = (RequestContactDB_Impl) this.f6064a;
        requestContactDB_Impl.assertNotSuspendingTransaction();
        c cVar = (c) this.f6068e;
        SupportSQLiteStatement supportSQLiteStatementA = cVar.a();
        supportSQLiteStatementA.bindString(1, str);
        supportSQLiteStatementA.bindString(2, str2);
        try {
            requestContactDB_Impl.beginTransaction();
            try {
                int iExecuteUpdateDelete = supportSQLiteStatementA.executeUpdateDelete();
                requestContactDB_Impl.setTransactionSuccessful();
                requestContactDB_Impl.endTransaction();
                cVar.c(supportSQLiteStatementA);
                return iExecuteUpdateDelete;
            } catch (Throwable th) {
                requestContactDB_Impl.endTransaction();
                throw th;
            }
        } catch (Throwable th2) {
            cVar.c(supportSQLiteStatementA);
            throw th2;
        }
    }

    @Override // com.facebook.hermes.intl.IPlatformNumberFormatter
    public String fieldToString(AttributedCharacterIterator.Attribute attribute, double d2) {
        if (attribute == NumberFormat.Field.SIGN) {
            return Double.compare(d2, 0.0d) >= 0 ? "plusSign" : "minusSign";
        }
        if (attribute == NumberFormat.Field.INTEGER) {
            if (Double.isNaN(d2)) {
                return "nan";
            }
            return Double.isInfinite(d2) ? "infinity" : "integer";
        }
        if (attribute == NumberFormat.Field.FRACTION) {
            return "fraction";
        }
        if (attribute == NumberFormat.Field.EXPONENT) {
            return "exponentInteger";
        }
        if (attribute == NumberFormat.Field.EXPONENT_SIGN) {
            return "exponentMinusSign";
        }
        if (attribute == NumberFormat.Field.EXPONENT_SYMBOL) {
            return "exponentSeparator";
        }
        if (attribute == NumberFormat.Field.DECIMAL_SEPARATOR) {
            return "decimal";
        }
        if (attribute == NumberFormat.Field.GROUPING_SEPARATOR) {
            return "group";
        }
        if (attribute == NumberFormat.Field.PERCENT) {
            return "percentSign";
        }
        if (attribute == NumberFormat.Field.PERMILLE) {
            return "permilleSign";
        }
        if (attribute == NumberFormat.Field.CURRENCY) {
            return FirebaseAnalytics.Param.CURRENCY;
        }
        return attribute.toString().equals("android.icu.text.NumberFormat$Field(compact)") ? "compact" : "literal";
    }

    @Override // com.facebook.hermes.intl.IPlatformNumberFormatter
    public String format(double d2) {
        try {
            try {
                UFormat uFormat = (UFormat) this.f6064a;
                return (!(uFormat instanceof MeasureFormat) || ((MeasureUnit) this.f6068e) == null) ? uFormat.format(Double.valueOf(d2)) : uFormat.format(new Measure(Double.valueOf(d2), (MeasureUnit) this.f6068e));
            } catch (RuntimeException unused) {
                return NumberFormat.getInstance(ULocale.forLanguageTag("en")).format(d2);
            }
        } catch (NumberFormatException unused2) {
            return NumberFormat.getInstance(ULocale.getDefault()).format(d2);
        }
    }

    @Override // com.facebook.hermes.intl.IPlatformNumberFormatter
    public AttributedCharacterIterator formatToParts(double d2) {
        try {
            try {
                UFormat uFormat = (UFormat) this.f6064a;
                return (!(uFormat instanceof MeasureFormat) || ((MeasureUnit) this.f6068e) == null) ? uFormat.formatToCharacterIterator(Double.valueOf(d2)) : uFormat.formatToCharacterIterator(new Measure(Double.valueOf(d2), (MeasureUnit) this.f6068e));
            } catch (RuntimeException unused) {
                return NumberFormat.getInstance(ULocale.forLanguageTag("en")).formatToCharacterIterator(Double.valueOf(d2));
            }
        } catch (NumberFormatException unused2) {
            return NumberFormat.getInstance(ULocale.getDefault()).formatToCharacterIterator(Double.valueOf(d2));
        } catch (Exception unused3) {
            return NumberFormat.getInstance(ULocale.forLanguageTag("en")).formatToCharacterIterator(Double.valueOf(d2));
        }
    }

    @Override // com.facebook.hermes.intl.IPlatformNumberFormatter
    public String[] getAvailableLocales() {
        ArrayList arrayList = new ArrayList();
        for (ULocale uLocale : ULocale.getAvailableLocales()) {
            arrayList.add(uLocale.toLanguageTag());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    @Override // com.facebook.hermes.intl.IPlatformNumberFormatter
    public String getDefaultNumberingSystem(ILocaleObject iLocaleObject) {
        return NumberingSystem.getInstance((ULocale) iLocaleObject.getLocale()).getName();
    }

    @Override // com.transsnet.palmpay.core.db.dao.RequestContactDao
    public long insert(RequestContact requestContact) {
        RequestContactDB_Impl requestContactDB_Impl = (RequestContactDB_Impl) this.f6064a;
        requestContactDB_Impl.assertNotSuspendingTransaction();
        requestContactDB_Impl.beginTransaction();
        try {
            Td.a aVar = (Td.a) this.f6065b;
            SupportSQLiteStatement supportSQLiteStatementA = aVar.a();
            try {
                aVar.d(supportSQLiteStatementA, requestContact);
                long jExecuteInsert = supportSQLiteStatementA.executeInsert();
                aVar.c(supportSQLiteStatementA);
                requestContactDB_Impl.setTransactionSuccessful();
                requestContactDB_Impl.endTransaction();
                return jExecuteInsert;
            } catch (Throwable th) {
                aVar.c(supportSQLiteStatementA);
                throw th;
            }
        } catch (Throwable th2) {
            requestContactDB_Impl.endTransaction();
            throw th2;
        }
    }

    @Override // com.facebook.fresco.animation.bitmap.preparation.BitmapFramePreparer
    public boolean prepareFrame(BitmapFrameCache bitmapFrameCache, AnimationBackend animationBackend, int i7) throws Throwable {
        Throwable th;
        int iHashCode = (animationBackend.hashCode() * 31) + i7;
        synchronized (((SparseArray) this.f6068e)) {
            try {
                try {
                    try {
                        if (((SparseArray) this.f6068e).get(iHashCode) != null) {
                            p229p2.a.o(a.class, "Already scheduled decode job for frame %d", Integer.valueOf(i7));
                            return true;
                        }
                        if (bitmapFrameCache.contains(i7)) {
                            p229p2.a.o(a.class, "Frame %d is cached already.", Integer.valueOf(i7));
                            return true;
                        }
                        p152k5.c cVar = new p152k5.c(this, animationBackend, bitmapFrameCache, i7, iHashCode);
                        ((SparseArray) this.f6068e).put(iHashCode, cVar);
                        ((SerialExecutorService) this.f6067d).execute(cVar);
                        return true;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                }
            } catch (Throwable th4) {
                th = th4;
                th = th;
            }
            throw th;
        }
    }

    @Override // com.transsnet.palmpay.core.db.dao.RequestContactDao
    public List queryRequestContactList(String str) throws Throwable {
        L l5;
        L lAcquire = L.f17714j.acquire("SELECT * FROM request_contacts WHERE own_member_id = ? Order By create_time desc", 1);
        lAcquire.bindString(1, str);
        RequestContactDB_Impl requestContactDB_Impl = (RequestContactDB_Impl) this.f6064a;
        requestContactDB_Impl.assertNotSuspendingTransaction();
        Cursor cursorK = com.facebook.imagepipeline.nativecode.b.K(requestContactDB_Impl, lAcquire, false);
        try {
            int iK = androidx.camera.core.impl.utils.executor.g.k(cursorK, "contact_member_id");
            int iK2 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "alias");
            int iK3 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "full_name");
            int iK4 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "is_favourite");
            int iK5 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "is_friend");
            int iK6 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "phone");
            int iK7 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "photo_path");
            int iK8 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "request_source");
            int iK9 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "create_time");
            int iK10 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "update_time");
            int iK11 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "expire_time");
            int iK12 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "own_member_id");
            l5 = lAcquire;
            try {
                ArrayList arrayList = new ArrayList(cursorK.getCount());
                while (cursorK.moveToNext()) {
                    RequestContact requestContact = new RequestContact();
                    requestContact.setContactsMemberId(cursorK.getString(iK));
                    requestContact.setAlias(cursorK.isNull(iK2) ? null : cursorK.getString(iK2));
                    requestContact.setFullName(cursorK.isNull(iK3) ? null : cursorK.getString(iK3));
                    requestContact.setIsFavourite(cursorK.isNull(iK4) ? null : cursorK.getString(iK4));
                    requestContact.setFriend(cursorK.getInt(iK5) != 0);
                    requestContact.setPhone(cursorK.isNull(iK6) ? null : cursorK.getString(iK6));
                    requestContact.setPhotoPath(cursorK.isNull(iK7) ? null : cursorK.getString(iK7));
                    requestContact.setRequestSource(cursorK.isNull(iK8) ? null : cursorK.getString(iK8));
                    int i7 = iK2;
                    int i10 = iK3;
                    requestContact.setCreateTime(cursorK.getLong(iK9));
                    requestContact.setUpdateTime(cursorK.getLong(iK10));
                    requestContact.setExpireTime(cursorK.getLong(iK11));
                    requestContact.setMemberId(cursorK.getString(iK12));
                    arrayList.add(requestContact);
                    iK2 = i7;
                    iK3 = i10;
                }
                cursorK.close();
                l5.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorK.close();
                l5.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            l5 = lAcquire;
        }
    }

    @Override // com.facebook.hermes.intl.IPlatformNumberFormatter
    public IPlatformNumberFormatter setCurrency(String str, s sVar) throws B {
        if (((x) this.f6067d) == x.f9181c) {
            Currency currency = Currency.getInstance(str);
            ((NumberFormat) this.f6065b).setCurrency(currency);
            if (sVar != s.f9164b) {
                C c6 = (C) this.f6066c;
                c6.a();
                str = currency.getName(c6.f9108a, sVar.ordinal() != 3 ? 0 : 1, (boolean[]) null);
            }
            NumberFormat numberFormat = (NumberFormat) this.f6065b;
            if (numberFormat instanceof DecimalFormat) {
                DecimalFormat decimalFormat = (DecimalFormat) numberFormat;
                DecimalFormatSymbols decimalFormatSymbols = decimalFormat.getDecimalFormatSymbols();
                decimalFormatSymbols.setCurrencySymbol(str);
                decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
            }
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.IPlatformNumberFormatter
    public IPlatformNumberFormatter setFractionDigits(v vVar, int i7, int i10) {
        if (vVar == v.f9174b) {
            if (i7 >= 0) {
                ((NumberFormat) this.f6065b).setMinimumFractionDigits(i7);
            }
            if (i10 >= 0) {
                ((NumberFormat) this.f6065b).setMaximumFractionDigits(i10);
            }
            NumberFormat numberFormat = (NumberFormat) this.f6065b;
            if (numberFormat instanceof DecimalFormat) {
                ((DecimalFormat) numberFormat).setSignificantDigitsUsed(false);
            }
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.IPlatformNumberFormatter
    public IPlatformNumberFormatter setGrouping(boolean z3) {
        ((NumberFormat) this.f6065b).setGroupingUsed(z3);
        return this;
    }

    @Override // com.facebook.hermes.intl.IPlatformNumberFormatter
    public IPlatformNumberFormatter setMinIntergerDigits(int i7) {
        if (i7 != -1) {
            ((NumberFormat) this.f6065b).setMinimumIntegerDigits(i7);
        }
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0045  */
    /* JADX WARN: Code duplicated, block: B:24:0x004f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0069  */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
    
        if (r9 != 3) goto L28;
     */
    @Override // com.facebook.hermes.intl.IPlatformNumberFormatter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.facebook.hermes.intl.IPlatformNumberFormatter setSignDisplay(U2.w r9) {
        /*
            r8 = this;
            r0 = 0
            r1 = 1
            java.lang.Object r2 = r8.f6065b
            android.icu.text.NumberFormat r2 = (android.icu.text.NumberFormat) r2
            boolean r3 = r2 instanceof android.icu.text.DecimalFormat
            if (r3 == 0) goto L79
            android.icu.text.DecimalFormat r2 = (android.icu.text.DecimalFormat) r2
            android.icu.text.DecimalFormatSymbols r3 = r2.getDecimalFormatSymbols()
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 31
            r6 = 3
            r7 = 2
            if (r4 < r5) goto L2b
            int r9 = r9.ordinal()
            if (r9 == r1) goto L27
            if (r9 == r7) goto L23
            if (r9 == r6) goto L27
            goto L79
        L23:
            U2.D.p(r2)
            return r8
        L27:
            U2.D.B(r2)
            return r8
        L2b:
            int r9 = r9.ordinal()
            if (r9 == r1) goto L45
            if (r9 == r7) goto L36
            if (r9 == r6) goto L45
            goto L79
        L36:
            java.lang.String r9 = ""
            r2.setPositivePrefix(r9)
            r2.setPositiveSuffix(r9)
            r2.setNegativePrefix(r9)
            r2.setNegativeSuffix(r9)
            return r8
        L45:
            java.lang.String r9 = r2.getNegativePrefix()
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L5f
            java.lang.String r9 = new java.lang.String
            char r4 = r3.getPlusSign()
            char[] r5 = new char[r1]
            r5[r0] = r4
            r9.<init>(r5)
            r2.setPositivePrefix(r9)
        L5f:
            java.lang.String r9 = r2.getNegativeSuffix()
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L79
            java.lang.String r9 = new java.lang.String
            char r3 = r3.getPlusSign()
            char[] r1 = new char[r1]
            r1[r0] = r3
            r9.<init>(r1)
            r2.setPositiveSuffix(r9)
        L79:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: N2.a.setSignDisplay(U2.w):com.facebook.hermes.intl.IPlatformNumberFormatter");
    }

    @Override // com.facebook.hermes.intl.IPlatformNumberFormatter
    public IPlatformNumberFormatter setSignificantDigits(v vVar, int i7, int i10) throws B {
        NumberFormat numberFormat = (NumberFormat) this.f6065b;
        if ((numberFormat instanceof DecimalFormat) && vVar == v.f9173a) {
            DecimalFormat decimalFormat = (DecimalFormat) numberFormat;
            if (i7 >= 0) {
                decimalFormat.setMinimumSignificantDigits(i7);
            }
            if (i10 >= 0) {
                if (i10 < decimalFormat.getMinimumSignificantDigits()) {
                    throw new B("maximumSignificantDigits should be at least equal to minimumSignificantDigits", 0);
                }
                decimalFormat.setMaximumSignificantDigits(i10);
            }
            decimalFormat.setSignificantDigitsUsed(true);
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.IPlatformNumberFormatter
    public IPlatformNumberFormatter setUnits(String str, y yVar) throws B {
        MeasureUnit next;
        MeasureFormat.FormatWidth formatWidth;
        if (((x) this.f6067d) != x.f9182d) {
            return this;
        }
        Iterator<MeasureUnit> it = MeasureUnit.getAvailable().iterator();
        do {
            if (!it.hasNext()) {
                throw new B(G.o("Unknown unit: ", str), 0);
            }
            next = it.next();
            if (next.getSubtype().equals(str)) {
                break;
            }
        } while (!next.getSubtype().equals(next.getType() + "-" + str));
        this.f6068e = next;
        C c6 = (C) this.f6066c;
        c6.a();
        ULocale uLocale = c6.f9108a;
        int iOrdinal = yVar.ordinal();
        if (iOrdinal != 1) {
            formatWidth = iOrdinal != 2 ? MeasureFormat.FormatWidth.SHORT : MeasureFormat.FormatWidth.WIDE;
        } else {
            formatWidth = MeasureFormat.FormatWidth.NARROW;
        }
        this.f6064a = MeasureFormat.getInstance(uLocale, formatWidth, (NumberFormat) this.f6065b);
        return this;
    }

    @Override // com.transsnet.palmpay.core.db.dao.RequestContactDao
    public int update(RequestContact requestContact) {
        RequestContactDB_Impl requestContactDB_Impl = (RequestContactDB_Impl) this.f6064a;
        requestContactDB_Impl.assertNotSuspendingTransaction();
        requestContactDB_Impl.beginTransaction();
        try {
            int iE = ((Td.b) this.f6067d).e(requestContact);
            requestContactDB_Impl.setTransactionSuccessful();
            return iE;
        } finally {
            requestContactDB_Impl.endTransaction();
        }
    }

    @Override // com.transsnet.palmpay.core.db.dao.RequestContactDao
    public List queryRequestContactList(String str, long j6) throws Throwable {
        L l5;
        L lAcquire = L.f17714j.acquire("SELECT * FROM request_contacts WHERE own_member_id = ? AND create_time > ? Order By create_time desc", 2);
        lAcquire.bindString(1, str);
        lAcquire.bindLong(2, j6);
        RequestContactDB_Impl requestContactDB_Impl = (RequestContactDB_Impl) this.f6064a;
        requestContactDB_Impl.assertNotSuspendingTransaction();
        Cursor cursorK = com.facebook.imagepipeline.nativecode.b.K(requestContactDB_Impl, lAcquire, false);
        try {
            int iK = androidx.camera.core.impl.utils.executor.g.k(cursorK, "contact_member_id");
            int iK2 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "alias");
            int iK3 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "full_name");
            int iK4 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "is_favourite");
            int iK5 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "is_friend");
            int iK6 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "phone");
            int iK7 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "photo_path");
            int iK8 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "request_source");
            int iK9 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "create_time");
            int iK10 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "update_time");
            int iK11 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "expire_time");
            int iK12 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "own_member_id");
            l5 = lAcquire;
            try {
                ArrayList arrayList = new ArrayList(cursorK.getCount());
                while (cursorK.moveToNext()) {
                    RequestContact requestContact = new RequestContact();
                    requestContact.setContactsMemberId(cursorK.getString(iK));
                    requestContact.setAlias(cursorK.isNull(iK2) ? null : cursorK.getString(iK2));
                    requestContact.setFullName(cursorK.isNull(iK3) ? null : cursorK.getString(iK3));
                    requestContact.setIsFavourite(cursorK.isNull(iK4) ? null : cursorK.getString(iK4));
                    requestContact.setFriend(cursorK.getInt(iK5) != 0);
                    requestContact.setPhone(cursorK.isNull(iK6) ? null : cursorK.getString(iK6));
                    requestContact.setPhotoPath(cursorK.isNull(iK7) ? null : cursorK.getString(iK7));
                    requestContact.setRequestSource(cursorK.isNull(iK8) ? null : cursorK.getString(iK8));
                    int i7 = iK;
                    int i10 = iK2;
                    requestContact.setCreateTime(cursorK.getLong(iK9));
                    requestContact.setUpdateTime(cursorK.getLong(iK10));
                    requestContact.setExpireTime(cursorK.getLong(iK11));
                    requestContact.setMemberId(cursorK.getString(iK12));
                    arrayList.add(requestContact);
                    iK = i7;
                    iK2 = i10;
                }
                cursorK.close();
                l5.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorK.close();
                l5.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            l5 = lAcquire;
        }
    }
}
