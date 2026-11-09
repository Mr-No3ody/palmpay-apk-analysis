package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f15726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15727b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15728c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseArray f15729d = new SparseArray();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SparseArray f15730e = new SparseArray();

    /* JADX WARN: Code duplicated, block: B:32:0x0072  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public f(Context context, ConstraintLayout constraintLayout, int i7) {
        this.f15726a = constraintLayout;
        XmlResourceParser xml = context.getResources().getXml(i7);
        try {
            int eventType = xml.getEventType();
            d dVar = null;
            while (true) {
                byte b7 = 1;
                if (eventType == 1) {
                    return;
                }
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (!name.equals("ConstraintSet")) {
                                b7 = -1;
                            } else {
                                b7 = 4;
                            }
                            break;
                        case 80204913:
                            if (!name.equals("State")) {
                                b7 = -1;
                            } else {
                                b7 = 2;
                            }
                            break;
                        case 1382829617:
                            if (!name.equals("StateSet")) {
                                b7 = -1;
                            }
                            break;
                        case 1657696882:
                            if (!name.equals("layoutDescription")) {
                                b7 = -1;
                            } else {
                                b7 = 0;
                            }
                            break;
                        case 1901439077:
                            if (!name.equals("Variant")) {
                                b7 = -1;
                            } else {
                                b7 = 3;
                            }
                            break;
                        default:
                            b7 = -1;
                            break;
                    }
                    if (b7 == 2) {
                        dVar = new d(context, xml);
                        this.f15729d.put(dVar.f15716a, dVar);
                    } else if (b7 == 3) {
                        e eVar = new e(context, xml);
                        if (dVar != null) {
                            dVar.f15717b.add(eVar);
                        }
                    } else if (b7 == 4) {
                        a(context, xml);
                    }
                }
                eventType = xml.next();
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }

    public final void a(Context context, XmlResourceParser xmlResourceParser) {
        m mVar = new m();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i7 = 0; i7 < attributeCount; i7++) {
            String attributeName = xmlResourceParser.getAttributeName(i7);
            String attributeValue = xmlResourceParser.getAttributeValue(i7);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                mVar.n(context, xmlResourceParser);
                this.f15730e.put(identifier, mVar);
                return;
            }
        }
    }

    public final void b(float f10, float f11, int i7) {
        int i10 = this.f15727b;
        SparseArray sparseArray = this.f15729d;
        int i11 = 0;
        ConstraintLayout constraintLayout = this.f15726a;
        if (i10 != i7) {
            this.f15727b = i7;
            d dVar = (d) sparseArray.get(i7);
            while (true) {
                ArrayList arrayList = dVar.f15717b;
                if (i11 >= arrayList.size()) {
                    i11 = -1;
                    break;
                } else if (((e) arrayList.get(i11)).a(f10, f11)) {
                    break;
                } else {
                    i11++;
                }
            }
            ArrayList arrayList2 = dVar.f15717b;
            m mVar = i11 == -1 ? dVar.f15719d : ((e) arrayList2.get(i11)).f15725f;
            if (i11 != -1) {
                int i12 = ((e) arrayList2.get(i11)).f15724e;
            }
            if (mVar == null) {
                return;
            }
            this.f15728c = i11;
            mVar.b(constraintLayout);
            return;
        }
        d dVar2 = i7 == -1 ? (d) sparseArray.valueAt(0) : (d) sparseArray.get(i10);
        int i13 = this.f15728c;
        if (i13 == -1 || !((e) dVar2.f15717b.get(i13)).a(f10, f11)) {
            while (true) {
                ArrayList arrayList3 = dVar2.f15717b;
                if (i11 >= arrayList3.size()) {
                    i11 = -1;
                    break;
                } else if (((e) arrayList3.get(i11)).a(f10, f11)) {
                    break;
                } else {
                    i11++;
                }
            }
            if (this.f15728c == i11) {
                return;
            }
            ArrayList arrayList4 = dVar2.f15717b;
            m mVar2 = i11 == -1 ? null : ((e) arrayList4.get(i11)).f15725f;
            if (i11 != -1) {
                int i14 = ((e) arrayList4.get(i11)).f15724e;
            }
            if (mVar2 == null) {
                return;
            }
            this.f15728c = i11;
            mVar2.b(constraintLayout);
        }
    }
}
