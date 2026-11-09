package androidx.room;

import androidx.annotation.RequiresApi;
import com.transsnet.palmpay.core.bean.req.GetCustomerServiceUrlReq;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.TYPE})
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\u0002\u0018\u00002\u00020\u0001Bg\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\f\b\u0002\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0012R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0013R\u0015\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00068\u0006¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0014R\u0011\u0010\b\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\b\u0010\u0012R\u0011\u0010\n\u001a\u00020\t8\u0006¢\u0006\u0006\u001a\u0004\b\n\u0010\u0015R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0013R\u0011\u0010\r\u001a\u00020\f8\u0006¢\u0006\u0006\u001a\u0004\b\r\u0010\u0016R\u0011\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroidx/room/Fts4;", "", "", "tokenizer", "", "tokenizerArgs", "Lkotlin/reflect/KClass;", "contentEntity", "languageId", "Landroidx/room/p;", "matchInfo", "notIndexed", "", "prefix", "Landroidx/room/q;", GetCustomerServiceUrlReq.ENTER_TYPE_ORDER_DETAIL, "<init>", "(Ljava/lang/String;Lkotlin/Array;Lkotlin/reflect/KClass;Ljava/lang/String;Landroidx/room/p;Lkotlin/Array;[ILandroidx/room/q;)V", "()Ljava/lang/String;", "()[Ljava/lang/String;", "()Ljava/lang/Class;", "()Landroidx/room/p;", "()[I", "()Landroidx/room/q;", "room-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.annotation.Target(allowedTargets = {p371yf.b.f44347a})
@RequiresApi(16)
@Retention(RetentionPolicy.CLASS)
@kotlin.annotation.Retention(p371yf.a.f44342b)
public @interface Fts4 {
    Class<?> contentEntity() default Object.class;

    String languageId() default "";

    EnumC1237p matchInfo() default EnumC1237p.f17785a;

    String[] notIndexed() default {};

    EnumC1238q order() default EnumC1238q.f17787a;

    int[] prefix() default {};

    String tokenizer() default "simple";

    String[] tokenizerArgs() default {};
}
