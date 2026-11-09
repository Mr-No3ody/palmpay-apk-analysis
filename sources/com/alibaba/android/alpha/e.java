package com.alibaba.android.alpha;

import C0.G;
import N8.q0;
import android.text.TextUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static ConfigParser$ProjectInfo a(c cVar) {
        Task task;
        InstantiationException e10;
        IllegalAccessException e11;
        ClassNotFoundException e12;
        ArrayList<d> arrayList = cVar.f20333a;
        HashMap map = new HashMap();
        for (d dVar : arrayList) {
            try {
                task = (Task) Class.forName(dVar.f20337b).newInstance();
                try {
                    task.setName(dVar.f20336a);
                    int i7 = dVar.f20339d;
                    if (i7 != 0) {
                        task.setThreadPriority(i7);
                    }
                    int i10 = dVar.f20340e;
                    if (i10 != 0) {
                        task.setExecutePriority(i10);
                    }
                } catch (ClassNotFoundException e13) {
                    e12 = e13;
                    AlphaLog.w(e12);
                } catch (IllegalAccessException e14) {
                    e11 = e14;
                    AlphaLog.w(e11);
                } catch (InstantiationException e15) {
                    e10 = e15;
                    AlphaLog.w(e10);
                }
            } catch (ClassNotFoundException e16) {
                task = null;
                e12 = e16;
            } catch (IllegalAccessException e17) {
                task = null;
                e11 = e17;
            } catch (InstantiationException e18) {
                task = null;
                e10 = e18;
            }
            if (task == null) {
                throw new RuntimeException("Can not reflect Task: " + dVar.f20337b);
            }
            map.put(dVar.f20336a, task);
        }
        Project.Builder builder = new Project.Builder();
        for (d dVar2 : arrayList) {
            builder.add((Task) map.get(dVar2.f20336a));
            ArrayList<String> arrayList2 = dVar2.f20338c;
            if (!arrayList2.isEmpty()) {
                for (String str : arrayList2) {
                    Task task2 = (Task) map.get(str);
                    if (task2 == null) {
                        throw new RuntimeException(G.o("No such task: ", str));
                    }
                    builder.after(task2);
                }
            }
        }
        return new ConfigParser$ProjectInfo(builder.create(), cVar.f20334b, cVar.f20335c);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003e  */
    public static ArrayList b(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i7;
        ArrayList arrayList = new ArrayList();
        int i10 = 2;
        xmlPullParser.require(2, null, "projects");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == i10) {
                if ("project".equals(xmlPullParser.getName())) {
                    xmlPullParser.require(i10, null, "project");
                    ArrayList arrayList2 = new ArrayList();
                    String attributeValue = xmlPullParser.getAttributeValue(null, "mode");
                    if ("allProcess".equals(attributeValue)) {
                        i7 = 3;
                    } else if ("mainProcess".equals(attributeValue)) {
                        i7 = 1;
                    } else if ("secondaryProcess".equals(attributeValue)) {
                        i7 = i10;
                    } else {
                        i7 = 3;
                    }
                    String attributeValue2 = xmlPullParser.getAttributeValue(null, "process");
                    while (xmlPullParser.next() != 3) {
                        if (xmlPullParser.getEventType() == i10) {
                            if ("task".equals(xmlPullParser.getName())) {
                                xmlPullParser.require(i10, null, "task");
                                String attributeValue3 = xmlPullParser.getAttributeValue(null, "name");
                                String attributeValue4 = xmlPullParser.getAttributeValue(null, "class");
                                String attributeValue5 = xmlPullParser.getAttributeValue(null, "predecessor");
                                String attributeValue6 = xmlPullParser.getAttributeValue(null, "threadPriority");
                                String attributeValue7 = xmlPullParser.getAttributeValue(null, "executePriority");
                                if (TextUtils.isEmpty(attributeValue3)) {
                                    throw new RuntimeException("Task name is not set.");
                                }
                                if (TextUtils.isEmpty(attributeValue4)) {
                                    throw new RuntimeException(q0.k("The path of task : ", attributeValue3, " is not set."));
                                }
                                d dVar = new d();
                                ArrayList arrayList3 = new ArrayList();
                                dVar.f20338c = arrayList3;
                                dVar.f20339d = 0;
                                dVar.f20340e = 0;
                                dVar.f20336a = attributeValue3;
                                dVar.f20337b = attributeValue4;
                                if (!TextUtils.isEmpty(attributeValue5)) {
                                    arrayList3.addAll(TextUtils.isEmpty(attributeValue5) ? null : Arrays.asList(TextUtils.split(attributeValue5.replace(" ", ""), ",")));
                                }
                                if (!TextUtils.isEmpty(attributeValue6)) {
                                    dVar.f20339d = Integer.parseInt(attributeValue6);
                                }
                                if (!TextUtils.isEmpty(attributeValue7)) {
                                    dVar.f20340e = Integer.parseInt(attributeValue7);
                                }
                                xmlPullParser.nextTag();
                                xmlPullParser.require(3, null, "task");
                                arrayList2.add(dVar);
                            } else {
                                c(xmlPullParser);
                            }
                            i10 = 2;
                        }
                    }
                    c cVar = new c();
                    new ArrayList();
                    cVar.f20334b = i7;
                    cVar.f20335c = attributeValue2;
                    cVar.f20333a = arrayList2;
                    arrayList.add(cVar);
                } else {
                    c(xmlPullParser);
                }
                i10 = 2;
            }
        }
        return arrayList;
    }

    public static void c(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (xmlPullParser.getEventType() != 2) {
            throw new IllegalStateException();
        }
        int i7 = 1;
        while (i7 != 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i7++;
            } else if (next == 3) {
                i7--;
            }
        }
    }
}
