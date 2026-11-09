package K0;

import Af.l;
import android.database.Cursor;
import androidx.sqlite.db.SupportSQLiteDatabase;
import io.fastkv.n;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.G;
import kotlin.collections.N;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    @NotNull
    public final h read(@NotNull SupportSQLiteDatabase database, @NotNull String tableName) throws IOException {
        Map mapB;
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(tableName, "tableName");
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(tableName, "tableName");
        Cursor cursorQuery = database.query("PRAGMA table_info(`" + tableName + "`)");
        try {
            if (cursorQuery.getColumnCount() <= 0) {
                mapB = G.c();
                cursorQuery.close();
            } else {
                int columnIndex = cursorQuery.getColumnIndex("name");
                int columnIndex2 = cursorQuery.getColumnIndex("type");
                int columnIndex3 = cursorQuery.getColumnIndex("notnull");
                int columnIndex4 = cursorQuery.getColumnIndex("pk");
                int columnIndex5 = cursorQuery.getColumnIndex("dflt_value");
                Af.e builder = new Af.e();
                while (cursorQuery.moveToNext()) {
                    String name = cursorQuery.getString(columnIndex);
                    String type = cursorQuery.getString(columnIndex2);
                    boolean z3 = cursorQuery.getInt(columnIndex3) != 0;
                    int i7 = cursorQuery.getInt(columnIndex4);
                    String string = cursorQuery.getString(columnIndex5);
                    Intrinsics.checkNotNullExpressionValue(name, "name");
                    Intrinsics.checkNotNullExpressionValue(type, "type");
                    builder.put(name, new b(name, type, string, i7, 2, z3));
                }
                Intrinsics.checkNotNullParameter(builder, "builder");
                mapB = builder.b();
                cursorQuery.close();
            }
            Cursor cursorQuery2 = database.query("PRAGMA foreign_key_list(`" + tableName + "`)");
            try {
                int columnIndex6 = cursorQuery2.getColumnIndex("id");
                int columnIndex7 = cursorQuery2.getColumnIndex("seq");
                int columnIndex8 = cursorQuery2.getColumnIndex("table");
                int columnIndex9 = cursorQuery2.getColumnIndex("on_delete");
                int columnIndex10 = cursorQuery2.getColumnIndex("on_update");
                List listE = n.E(cursorQuery2);
                cursorQuery2.moveToPosition(-1);
                l lVar = new l();
                while (cursorQuery2.moveToNext()) {
                    if (cursorQuery2.getInt(columnIndex7) == 0) {
                        int i10 = cursorQuery2.getInt(columnIndex6);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int i11 = columnIndex6;
                        ArrayList<e> arrayList3 = new ArrayList();
                        for (Object obj : listE) {
                            int i12 = columnIndex7;
                            List list = listE;
                            if (((e) obj).f4885a == i10) {
                                arrayList3.add(obj);
                            }
                            columnIndex7 = i12;
                            listE = list;
                        }
                        int i13 = columnIndex7;
                        List list2 = listE;
                        for (e eVar : arrayList3) {
                            arrayList.add(eVar.f4887c);
                            arrayList2.add(eVar.f4888d);
                        }
                        String string2 = cursorQuery2.getString(columnIndex8);
                        Intrinsics.checkNotNullExpressionValue(string2, "cursor.getString(tableColumnIndex)");
                        String string3 = cursorQuery2.getString(columnIndex9);
                        Intrinsics.checkNotNullExpressionValue(string3, "cursor.getString(onDeleteColumnIndex)");
                        String string4 = cursorQuery2.getString(columnIndex10);
                        Intrinsics.checkNotNullExpressionValue(string4, "cursor.getString(onUpdateColumnIndex)");
                        lVar.add(new d(string2, string3, string4, arrayList, arrayList2));
                        columnIndex6 = i11;
                        columnIndex7 = i13;
                        listE = list2;
                    }
                }
                l lVarA = N.a(lVar);
                cursorQuery2.close();
                Cursor cursorQuery3 = database.query("PRAGMA index_list(`" + tableName + "`)");
                try {
                    int columnIndex11 = cursorQuery3.getColumnIndex("name");
                    int columnIndex12 = cursorQuery3.getColumnIndex("origin");
                    int columnIndex13 = cursorQuery3.getColumnIndex("unique");
                    l lVarA2 = null;
                    if (columnIndex11 == -1 || columnIndex12 == -1 || columnIndex13 == -1) {
                        cursorQuery3.close();
                    } else {
                        l lVar2 = new l();
                        while (cursorQuery3.moveToNext()) {
                            if ("c".equals(cursorQuery3.getString(columnIndex12))) {
                                String name2 = cursorQuery3.getString(columnIndex11);
                                boolean z8 = cursorQuery3.getInt(columnIndex13) == 1;
                                Intrinsics.checkNotNullExpressionValue(name2, "name");
                                g gVarF = n.F(database, name2, z8);
                                if (gVarF == null) {
                                    cursorQuery3.close();
                                } else {
                                    lVar2.add(gVarF);
                                }
                            }
                        }
                        lVarA2 = N.a(lVar2);
                        cursorQuery3.close();
                    }
                    return new h(tableName, mapB, lVarA, lVarA2);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        org.chromium.support_lib_boundary.util.b.o(cursorQuery3, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    org.chromium.support_lib_boundary.util.b.o(cursorQuery2, th3);
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            try {
                throw th5;
            } catch (Throwable th6) {
                org.chromium.support_lib_boundary.util.b.o(cursorQuery, th5);
                throw th6;
            }
        }
    }

    private c() {
    }
}
