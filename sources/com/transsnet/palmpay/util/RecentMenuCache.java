package com.transsnet.palmpay.util;

import com.airbnb.lottie.model.layer.d;
import com.facebook.react.packagerconnection.a;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.transsnet.palmpay.core.bean.HomePageMenuData;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C1849p;
import kotlin.collections.CollectionsKt;
import kotlin.collections.v;
import kotlin.collections.z;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010a9.m;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001eB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\bH\u0002J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0002J,\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u000b2\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00140\u0013H\u0002J(\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u0014J\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0019J\u0016\u0010\u001a\u001a\u00020\u001b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0014H\u0002J\u0018\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\f\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\bJ\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/transsnet/palmpay/util/RecentMenuCache;", "", "<init>", "()V", "MAX_SIZE", "", "NAME_HASH_LENGTH", "ENTRY_SEPARATOR", "", "FIELD_SEPARATOR", "createKey", "Lcom/transsnet/palmpay/util/RecentMenuCache$RecentMenuKey;", "menuId", "menuName", "hashMenuName", "findMenuForKey", "Lcom/transsnet/palmpay/core/bean/HomePageMenuData;", "key", "menusById", "", "", "resolveRecentMenus", UserMetadata.KEYDATA_FILENAME, "menus", "getRecentMenus", "", "saveRecentMenus", "", "addRecentMenu", "pruneInvalidMenus", "RecentMenuKey", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRecentMenuCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecentMenuCache.kt\ncom/transsnet/palmpay/util/RecentMenuCache\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,182:1\n295#2,2:183\n1491#2:185\n1516#2,3:186\n1519#2,3:196\n1617#2,9:199\n1869#2:208\n1870#2:210\n1626#2:211\n1617#2,9:212\n1869#2:221\n1870#2:223\n1626#2:224\n1491#2:225\n1516#2,3:226\n1519#2,3:236\n774#2:239\n865#2,2:240\n384#3,7:189\n384#3,7:229\n1#4:209\n1#4:222\n*S KotlinDebug\n*F\n+ 1 RecentMenuCache.kt\ncom/transsnet/palmpay/util/RecentMenuCache\n*L\n109#1:183,2\n125#1:185\n125#1:186,3\n125#1:196,3\n126#1:199,9\n126#1:208\n126#1:210\n126#1:211\n138#1:212,9\n138#1:221\n138#1:223\n138#1:224\n174#1:225\n174#1:226,3\n174#1:236,3\n175#1:239\n175#1:240,2\n125#1:189,7\n174#1:229,7\n126#1:209\n138#1:222\n*E\n"})
public final class RecentMenuCache {

    @NotNull
    private static final String ENTRY_SEPARATOR = ",";

    @NotNull
    private static final String FIELD_SEPARATOR = ":";

    @NotNull
    public static final RecentMenuCache INSTANCE = new RecentMenuCache();
    private static final int MAX_SIZE = 4;
    private static final int NAME_HASH_LENGTH = 16;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\u0005J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/transsnet/palmpay/util/RecentMenuCache$RecentMenuKey;", "", "menuId", "", "nameHash", "", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;)V", "getMenuId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getNameHash", "()Ljava/lang/String;", "isValid", "", "encode", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/String;)Lcom/transsnet/palmpay/util/RecentMenuCache$RecentMenuKey;", "equals", "other", "hashCode", "toString", "Companion", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RecentMenuKey {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @Nullable
        private final Integer menuId;

        @Nullable
        private final String nameHash;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H\u0002¨\u0006\u000b"}, d2 = {"Lcom/transsnet/palmpay/util/RecentMenuCache$RecentMenuKey$Companion;", "", "<init>", "()V", "decode", "Lcom/transsnet/palmpay/util/RecentMenuCache$RecentMenuKey;", "raw", "", "isHexString", "", "value", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension({"SMAP\nRecentMenuCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecentMenuCache.kt\ncom/transsnet/palmpay/util/RecentMenuCache$RecentMenuKey$Companion\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,182:1\n1069#2,2:183\n*S KotlinDebug\n*F\n+ 1 RecentMenuCache.kt\ncom/transsnet/palmpay/util/RecentMenuCache$RecentMenuKey$Companion\n*L\n72#1:183,2\n*E\n"})
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final boolean isHexString(String value) {
                for (int i7 = 0; i7 < value.length(); i7++) {
                    char cCharAt = value.charAt(i7);
                    if (('0' > cCharAt || cCharAt >= ':') && ('a' > cCharAt || cCharAt >= 'g')) {
                        return false;
                    }
                }
                return true;
            }

            @Nullable
            public final RecentMenuKey decode(@NotNull String raw) {
                int iE;
                Intrinsics.checkNotNullParameter(raw, "raw");
                if (raw.length() == 0 || (iE = StringsKt.E(raw, RecentMenuCache.FIELD_SEPARATOR, 0, false, 6)) <= 0) {
                    return null;
                }
                String strSubstring = raw.substring(0, iE);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                Integer intOrNull = StringsKt.toIntOrNull(strSubstring);
                if (intOrNull == null) {
                    return null;
                }
                int iIntValue = intOrNull.intValue();
                String strSubstring2 = raw.substring(iE + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                if (iIntValue > 0 && strSubstring2.length() == 16 && isHexString(strSubstring2)) {
                    return new RecentMenuKey(intOrNull, strSubstring2);
                }
                return null;
            }

            private Companion() {
            }
        }

        public RecentMenuKey(@Nullable Integer num, @Nullable String str) {
            this.menuId = num;
            this.nameHash = str;
        }

        public static /* synthetic */ RecentMenuKey copy$default(RecentMenuKey recentMenuKey, Integer num, String str, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                num = recentMenuKey.menuId;
            }
            if ((i7 & 2) != 0) {
                str = recentMenuKey.nameHash;
            }
            return recentMenuKey.copy(num, str);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Integer getMenuId() {
            return this.menuId;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getNameHash() {
            return this.nameHash;
        }

        @NotNull
        public final RecentMenuKey copy(@Nullable Integer menuId, @Nullable String nameHash) {
            return new RecentMenuKey(menuId, nameHash);
        }

        @NotNull
        public final String encode() {
            Integer num = this.menuId;
            return (num != null ? num.intValue() : 0) + RecentMenuCache.FIELD_SEPARATOR + this.nameHash;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RecentMenuKey)) {
                return false;
            }
            RecentMenuKey recentMenuKey = (RecentMenuKey) other;
            return Intrinsics.c(this.menuId, recentMenuKey.menuId) && Intrinsics.c(this.nameHash, recentMenuKey.nameHash);
        }

        @Nullable
        public final Integer getMenuId() {
            return this.menuId;
        }

        @Nullable
        public final String getNameHash() {
            return this.nameHash;
        }

        public int hashCode() {
            Integer num = this.menuId;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            String str = this.nameHash;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        public final boolean isValid() {
            Integer num = this.menuId;
            if ((num != null ? num.intValue() : 0) > 0) {
                String str = this.nameHash;
                if (str != null && str.length() == 16) {
                    return true;
                }
            }
            return false;
        }

        @NotNull
        public String toString() {
            return "RecentMenuKey(menuId=" + this.menuId + ", nameHash=" + this.nameHash + ")";
        }
    }

    private RecentMenuCache() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean addRecentMenu$lambda$6(RecentMenuKey recentMenuKey, RecentMenuKey it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.c(it, recentMenuKey);
    }

    private final RecentMenuKey createKey(int menuId, String menuName) {
        if (menuId <= 0 || menuName == null || menuName.length() == 0) {
            return null;
        }
        return new RecentMenuKey(Integer.valueOf(menuId), hashMenuName(menuName));
    }

    private final HomePageMenuData findMenuForKey(RecentMenuKey key, Map<Integer, ? extends List<? extends HomePageMenuData>> menusById) {
        List<? extends HomePageMenuData> list;
        Object obj = null;
        if (!key.isValid() || (list = menusById.get(key.getMenuId())) == null) {
            return null;
        }
        for (Object obj2 : list) {
            String str = ((HomePageMenuData) obj2).menuName;
            if (str != null && str.length() != 0 && Intrinsics.c(INSTANCE.hashMenuName(str), key.getNameHash())) {
                obj = obj2;
                break;
            }
        }
        return (HomePageMenuData) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [kotlin.collections.z] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v4 */
    private final String hashMenuName(String menuName) throws NoSuchAlgorithmException {
        ?? arrayList;
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = menuName.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        byte[] bArrDigest = messageDigest.digest(bytes);
        Intrinsics.e(bArrDigest);
        Intrinsics.checkNotNullParameter(bArrDigest, "<this>");
        int i7 = 0;
        if (8 >= bArrDigest.length) {
            Intrinsics.checkNotNullParameter(bArrDigest, "<this>");
            int length = bArrDigest.length;
            if (length == 0) {
                arrayList = z.f38935a;
            } else if (length != 1) {
                Intrinsics.checkNotNullParameter(bArrDigest, "<this>");
                arrayList = new ArrayList(bArrDigest.length);
                int length2 = bArrDigest.length;
                while (i7 < length2) {
                    arrayList.add(Byte.valueOf(bArrDigest[i7]));
                    i7++;
                }
            } else {
                arrayList = C1849p.c(Byte.valueOf(bArrDigest[0]));
            }
        } else {
            arrayList = new ArrayList(8);
            int length3 = bArrDigest.length;
            int i10 = 0;
            while (i7 < length3) {
                arrayList.add(Byte.valueOf(bArrDigest[i7]));
                i10++;
                if (i10 == 8) {
                    break;
                }
                i7++;
            }
        }
        return CollectionsKt.J((Iterable) arrayList, "", null, null, new a(19), 30);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence hashMenuName$lambda$0(byte b7) {
        return d.n(new Object[]{Byte.valueOf(b7)}, 1, "%02x", "format(...)");
    }

    private final void saveRecentMenus(List<RecentMenuKey> keys) {
        String value = CollectionsKt.J(keys, ENTRY_SEPARATOR, null, null, new a(20), 30);
        Intrinsics.checkNotNullParameter("main_sp_recent_menu_ids", "key");
        Intrinsics.checkNotNullParameter(value, "value");
        SPUtils.getInstance(p059e1.a.G("main_sp_recent_menu_ids")).put(p367ya.a.d().e("main_sp_recent_menu_ids"), value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence saveRecentMenus$lambda$5(RecentMenuKey it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.encode();
    }

    public final void addRecentMenu(int menuId, @Nullable String menuName) {
        RecentMenuKey recentMenuKeyCreateKey = createKey(menuId, menuName);
        if (recentMenuKeyCreateKey == null) {
            return;
        }
        List<RecentMenuKey> recentMenus = getRecentMenus();
        v.r(recentMenus, new m(recentMenuKeyCreateKey, 18));
        recentMenus.add(0, recentMenuKeyCreateKey);
        while (recentMenus.size() > 4) {
            recentMenus.remove(recentMenus.size() - 1);
        }
        saveRecentMenus(recentMenus);
    }

    @NotNull
    public final List<RecentMenuKey> getRecentMenus() {
        Intrinsics.checkNotNullParameter("main_sp_recent_menu_ids", "key");
        String string = SPUtils.getInstance(p059e1.a.G("main_sp_recent_menu_ids")).getString(p367ya.a.d().e("main_sp_recent_menu_ids"));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        if (string.length() == 0) {
            return new ArrayList();
        }
        List listSplit$default = StringsKt__StringsKt.split$default(string, new String[]{ENTRY_SEPARATOR}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList();
        Iterator it = listSplit$default.iterator();
        while (it.hasNext()) {
            RecentMenuKey recentMenuKeyDecode = RecentMenuKey.INSTANCE.decode((String) it.next());
            if (recentMenuKeyDecode != null) {
                arrayList.add(recentMenuKeyDecode);
            }
        }
        return CollectionsKt.Z(arrayList);
    }

    @NotNull
    public final List<RecentMenuKey> pruneInvalidMenus(@NotNull List<? extends HomePageMenuData> menus) {
        Intrinsics.checkNotNullParameter(menus, "menus");
        List<RecentMenuKey> recentMenus = getRecentMenus();
        if (recentMenus.isEmpty()) {
            return recentMenus;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : menus) {
            Integer numValueOf = Integer.valueOf(((HomePageMenuData) obj).menuId);
            Object arrayList = linkedHashMap.get(numValueOf);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(numValueOf, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : recentMenus) {
            if (INSTANCE.findMenuForKey((RecentMenuKey) obj2, linkedHashMap) != null) {
                arrayList2.add(obj2);
            }
        }
        if (arrayList2.size() != recentMenus.size()) {
            saveRecentMenus(arrayList2);
        }
        return arrayList2;
    }

    @NotNull
    public final List<HomePageMenuData> resolveRecentMenus(@NotNull List<RecentMenuKey> keys, @NotNull List<? extends HomePageMenuData> menus) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        Intrinsics.checkNotNullParameter(menus, "menus");
        if (keys.isEmpty() || menus.isEmpty()) {
            return z.f38935a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : menus) {
            Integer numValueOf = Integer.valueOf(((HomePageMenuData) obj).menuId);
            Object arrayList = linkedHashMap.get(numValueOf);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(numValueOf, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = keys.iterator();
        while (it.hasNext()) {
            HomePageMenuData homePageMenuDataFindMenuForKey = INSTANCE.findMenuForKey((RecentMenuKey) it.next(), linkedHashMap);
            if (homePageMenuDataFindMenuForKey != null) {
                arrayList2.add(homePageMenuDataFindMenuForKey);
            }
        }
        return arrayList2;
    }
}
