package p162kg;

import C0.G;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.CachedNames;
import p104gg.b;
import p133ig.g;

/* JADX INFO: loaded from: classes4.dex */
public abstract class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SerialDescriptor[] f38796a = new SerialDescriptor[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final KSerializer[] f38797b = new KSerializer[0];

    public static final C1830w a(String name, KSerializer primitiveSerializer) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(primitiveSerializer, "primitiveSerializer");
        return new C1830w(name, new C1831x(primitiveSerializer));
    }

    public static final Set b(SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        if (serialDescriptor instanceof CachedNames) {
            return ((CachedNames) serialDescriptor).getSerialNames();
        }
        HashSet hashSet = new HashSet(serialDescriptor.getElementsCount());
        int elementsCount = serialDescriptor.getElementsCount();
        for (int i7 = 0; i7 < elementsCount; i7++) {
            hashSet.add(serialDescriptor.getElementName(i7));
        }
        return hashSet;
    }

    public static final SerialDescriptor[] c(List list) {
        SerialDescriptor[] serialDescriptorArr;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            list = null;
        }
        return (list == null || (serialDescriptorArr = (SerialDescriptor[]) list.toArray(new SerialDescriptor[0])) == null) ? f38796a : serialDescriptorArr;
    }

    public static final int d(SerialDescriptor serialDescriptor, SerialDescriptor[] typeParams) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(typeParams, "typeParams");
        int iHashCode = (serialDescriptor.getSerialName().hashCode() * 31) + Arrays.hashCode(typeParams);
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        int elementsCount = serialDescriptor.getElementsCount();
        int i7 = 1;
        while (true) {
            int iHashCode2 = 0;
            if (!(elementsCount > 0)) {
                break;
            }
            int i10 = elementsCount - 1;
            int i11 = i7 * 31;
            String serialName = serialDescriptor.getElementDescriptor(serialDescriptor.getElementsCount() - elementsCount).getSerialName();
            if (serialName != null) {
                iHashCode2 = serialName.hashCode();
            }
            i7 = i11 + iHashCode2;
            elementsCount = i10;
        }
        int elementsCount2 = serialDescriptor.getElementsCount();
        int iHashCode3 = 1;
        while (true) {
            if (!(elementsCount2 > 0)) {
                return (((iHashCode * 31) + i7) * 31) + iHashCode3;
            }
            int i12 = elementsCount2 - 1;
            int i13 = iHashCode3 * 31;
            g kind = serialDescriptor.getElementDescriptor(serialDescriptor.getElementsCount() - elementsCount2).getKind();
            iHashCode3 = i13 + (kind != null ? kind.hashCode() : 0);
            elementsCount2 = i12;
        }
    }

    public static final void e(SerialDescriptor descriptor, int i7, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        ArrayList missingFields = new ArrayList();
        int i11 = (~i7) & i10;
        for (int i12 = 0; i12 < 32; i12++) {
            if ((i11 & 1) != 0) {
                missingFields.add(descriptor.getElementName(i12));
            }
            i11 >>>= 1;
        }
        String serialName = descriptor.getSerialName();
        Intrinsics.checkNotNullParameter(missingFields, "missingFields");
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        throw new b(missingFields, missingFields.size() == 1 ? G.s(new StringBuilder("Field '"), (String) missingFields.get(0), "' is required for type with serial name '", serialName, "', but it was missing") : "Fields " + missingFields + " are required for type with serial name '" + serialName + "', but they were missing", null);
    }
}
