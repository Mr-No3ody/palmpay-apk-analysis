package V5;

import N8.q0;
import com.nimbusds.jose.shaded.gson.z;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f10005b = new a(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f10006a;

    public d() {
        ArrayList arrayList = new ArrayList();
        this.f10006a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (com.nimbusds.jose.shaded.gson.internal.g.f23641a >= 9) {
            arrayList.add(new SimpleDateFormat("MMM d, yyyy h:mm:ss a", locale));
        }
    }

    @Override // com.nimbusds.jose.shaded.gson.z
    public final Object a(com.nimbusds.jose.shaded.gson.stream.b bVar) throws IOException {
        if (bVar.w() == 9) {
            bVar.s();
            return null;
        }
        String strU = bVar.u();
        synchronized (this.f10006a) {
            try {
                Iterator it = this.f10006a.iterator();
                while (it.hasNext()) {
                    try {
                        return ((DateFormat) it.next()).parse(strU);
                    } catch (ParseException unused) {
                    }
                }
                try {
                    return W5.a.b(strU, new ParsePosition(0));
                } catch (ParseException e10) {
                    StringBuilder sbQ = q0.q("Failed parsing '", strU, "' as Date; at path ");
                    sbQ.append(bVar.i());
                    throw new com.nimbusds.jose.shaded.gson.p(10, sbQ.toString(), e10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.nimbusds.jose.shaded.gson.z
    public final void b(com.nimbusds.jose.shaded.gson.stream.c cVar, Object obj) throws IOException {
        String str;
        Date date = (Date) obj;
        if (date == null) {
            cVar.i();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f10006a.get(0);
        synchronized (this.f10006a) {
            str = dateFormat.format(date);
        }
        cVar.p(str);
    }
}
