package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f15342b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashMap f15343a = new HashMap();

    static {
        HashMap map = new HashMap();
        f15342b = map;
        try {
            map.put("KeyAttribute", C1031d.class.getConstructor(new Class[0]));
            map.put("KeyPosition", h.class.getConstructor(new Class[0]));
            map.put("KeyCycle", e.class.getConstructor(new Class[0]));
            map.put("KeyTimeCycle", i.class.getConstructor(new Class[0]));
            map.put("KeyTrigger", j.class.getConstructor(new Class[0]));
        } catch (NoSuchMethodException e10) {
            Log.e("KeyFrames", "unable to load", e10);
        }
    }

    public f(Context context, XmlResourceParser xmlResourceParser) {
        Exception e10;
        AbstractC1029b abstractC1029b;
        HashMap map;
        HashMap map2;
        try {
            int eventType = xmlResourceParser.getEventType();
            AbstractC1029b abstractC1029b2 = null;
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlResourceParser.getName();
                    HashMap map3 = f15342b;
                    if (map3.containsKey(name)) {
                        try {
                            Constructor constructor = (Constructor) map3.get(name);
                            if (constructor == null) {
                                throw new NullPointerException("Keymaker for " + name + " not found");
                            }
                            abstractC1029b = (AbstractC1029b) constructor.newInstance(new Object[0]);
                            try {
                                abstractC1029b.c(context, Xml.asAttributeSet(xmlResourceParser));
                                b(abstractC1029b);
                            } catch (Exception e11) {
                                e10 = e11;
                                Log.e("KeyFrames", "unable to create ", e10);
                            }
                            abstractC1029b2 = abstractC1029b;
                        } catch (Exception e12) {
                            AbstractC1029b abstractC1029b3 = abstractC1029b2;
                            e10 = e12;
                            abstractC1029b = abstractC1029b3;
                        }
                        Log.e("KeyFrames", "unable to create ", e10);
                        abstractC1029b2 = abstractC1029b;
                    } else if (name.equalsIgnoreCase("CustomAttribute")) {
                        if (abstractC1029b2 != null && (map2 = abstractC1029b2.f15325d) != null) {
                            androidx.constraintlayout.widget.a.d(context, xmlResourceParser, map2);
                        }
                    } else if (name.equalsIgnoreCase("CustomMethod") && abstractC1029b2 != null && (map = abstractC1029b2.f15325d) != null) {
                        androidx.constraintlayout.widget.a.d(context, xmlResourceParser, map);
                    }
                } else if (eventType == 3 && "KeyFrameSet".equals(xmlResourceParser.getName())) {
                    return;
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e13) {
            e13.printStackTrace();
        } catch (XmlPullParserException e14) {
            e14.printStackTrace();
        }
    }

    public final void a(m mVar) {
        Integer numValueOf = Integer.valueOf(mVar.f15383c);
        HashMap map = this.f15343a;
        ArrayList arrayList = (ArrayList) map.get(numValueOf);
        if (arrayList != null) {
            mVar.f15402w.addAll(arrayList);
        }
        ArrayList<AbstractC1029b> arrayList2 = (ArrayList) map.get(-1);
        if (arrayList2 != null) {
            for (AbstractC1029b abstractC1029b : arrayList2) {
                String str = ((ConstraintLayout.LayoutParams) mVar.f15382b.getLayoutParams()).f15634Y;
                String str2 = abstractC1029b.f15324c;
                if ((str2 == null || str == null) ? false : str.matches(str2)) {
                    mVar.a(abstractC1029b);
                }
            }
        }
    }

    public final void b(AbstractC1029b abstractC1029b) {
        Integer numValueOf = Integer.valueOf(abstractC1029b.f15323b);
        HashMap map = this.f15343a;
        if (!map.containsKey(numValueOf)) {
            map.put(Integer.valueOf(abstractC1029b.f15323b), new ArrayList());
        }
        ArrayList arrayList = (ArrayList) map.get(Integer.valueOf(abstractC1029b.f15323b));
        if (arrayList != null) {
            arrayList.add(abstractC1029b);
        }
    }
}
