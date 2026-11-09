package androidx.room;

import androidx.annotation.RequiresApi;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.FIELD, ElementType.METHOD})
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\u0002\u0018\u00002\u00020\u0001:\u0002\u000f\u0010B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\fR\u0011\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\u0006\u001a\u0004\b\u0005\u0010\rR\u0011\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u000eR\u0011\u0010\b\u001a\u00020\u00048\u0007¢\u0006\u0006\u001a\u0004\b\b\u0010\rR\u0011\u0010\t\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\t\u0010\f¨\u0006\u0011"}, d2 = {"Landroidx/room/ColumnInfo;", "", "", "name", "", "typeAffinity", "", FirebaseAnalytics.Param.INDEX, "collate", "defaultValue", "<init>", "(Ljava/lang/String;IZILjava/lang/String;)V", "()Ljava/lang/String;", "()I", "()Z", "Collate", "SQLiteTypeAffinity", "room-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.annotation.Target(allowedTargets = {p371yf.b.f44351e, p371yf.b.f44355j})
@Retention(RetentionPolicy.CLASS)
@kotlin.annotation.Retention(p371yf.a.f44342b)
public @interface ColumnInfo {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/room/ColumnInfo$Collate;", "", "room-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @RequiresApi(21)
    @Retention(RetentionPolicy.CLASS)
    @kotlin.annotation.Retention(p371yf.a.f44342b)
    public @interface Collate {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/room/ColumnInfo$SQLiteTypeAffinity;", "", "room-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Retention(RetentionPolicy.CLASS)
    @kotlin.annotation.Retention(p371yf.a.f44342b)
    public @interface SQLiteTypeAffinity {
    }

    @Collate
    int collate() default 1;

    String defaultValue() default "[value-unspecified]";

    boolean index() default false;

    String name() default "[field-name]";

    @SQLiteTypeAffinity
    int typeAffinity() default 1;
}
