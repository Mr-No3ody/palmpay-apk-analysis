package androidx.datastore.preferences.protobuf;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface DescriptorProtos$FileDescriptorProtoOrBuilder extends MessageLiteOrBuilder {
    String getDependency(int index);

    AbstractC1123n getDependencyBytes(int index);

    int getDependencyCount();

    List<String> getDependencyList();

    E getEdition();

    I getEnumType(int index);

    int getEnumTypeCount();

    List<I> getEnumTypeList();

    C1107i0 getExtension(int index);

    int getExtensionCount();

    List<C1107i0> getExtensionList();

    C getMessageType(int index);

    int getMessageTypeCount();

    List<C> getMessageTypeList();

    String getName();

    AbstractC1123n getNameBytes();

    C1153x0 getOptions();

    String getPackage();

    AbstractC1123n getPackageBytes();

    int getPublicDependency(int index);

    int getPublicDependencyCount();

    List<Integer> getPublicDependencyList();

    N0 getService(int index);

    int getServiceCount();

    List<N0> getServiceList();

    T0 getSourceCodeInfo();

    String getSyntax();

    AbstractC1123n getSyntaxBytes();

    int getWeakDependency(int index);

    int getWeakDependencyCount();

    List<Integer> getWeakDependencyList();

    boolean hasEdition();

    boolean hasName();

    boolean hasOptions();

    boolean hasPackage();

    boolean hasSourceCodeInfo();

    boolean hasSyntax();
}
