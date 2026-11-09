package G6;

import com.transsnet.palmpay.core.bean.bill.TransType;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.StringTokenizer;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f3047a = System.getProperty("line.separator");

    public static ArrayList a(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter((Writer) stringWriter, true));
        StringTokenizer stringTokenizer = new StringTokenizer(stringWriter.toString(), f3047a);
        ArrayList arrayList = new ArrayList();
        boolean z3 = false;
        while (stringTokenizer.hasMoreTokens()) {
            String strNextToken = stringTokenizer.nextToken();
            int iIndexOf = strNextToken.indexOf(TransType.TRANS_TYPE_SCAN_TO_PAY);
            if (iIndexOf != -1 && strNextToken.substring(0, iIndexOf).trim().isEmpty()) {
                arrayList.add(strNextToken);
                z3 = true;
            } else if (z3) {
                break;
            }
        }
        return arrayList;
    }
}
