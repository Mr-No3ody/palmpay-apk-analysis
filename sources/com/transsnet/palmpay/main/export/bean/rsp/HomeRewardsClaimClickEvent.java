package com.transsnet.palmpay.main.export.bean.rsp;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tH\u0016J\u000f\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0002\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/transsnet/palmpay/main/export/bean/rsp/HomeRewardsClaimClickEvent;", "", "takeActivityId", "", "takeCouponCode", "takeContentType", "", "()Ljava/lang/Integer;", "takeBizIdList", "", "taskShowType", "module_main_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface HomeRewardsClaimClickEvent {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        @Nullable
        public static String takeActivityId(@NotNull HomeRewardsClaimClickEvent homeRewardsClaimClickEvent) {
            return null;
        }

        @Nullable
        public static List<String> takeBizIdList(@NotNull HomeRewardsClaimClickEvent homeRewardsClaimClickEvent) {
            return null;
        }

        @Nullable
        public static Integer takeContentType(@NotNull HomeRewardsClaimClickEvent homeRewardsClaimClickEvent) {
            return null;
        }

        @Nullable
        public static String takeCouponCode(@NotNull HomeRewardsClaimClickEvent homeRewardsClaimClickEvent) {
            return null;
        }

        @Nullable
        public static Integer taskShowType(@NotNull HomeRewardsClaimClickEvent homeRewardsClaimClickEvent) {
            return null;
        }
    }

    @Nullable
    String takeActivityId();

    @Nullable
    List<String> takeBizIdList();

    @Nullable
    Integer takeContentType();

    @Nullable
    String takeCouponCode();

    @Nullable
    Integer taskShowType();
}
