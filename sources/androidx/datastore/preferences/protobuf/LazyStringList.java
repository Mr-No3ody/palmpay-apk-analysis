package androidx.datastore.preferences.protobuf;

import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface LazyStringList extends ProtocolStringList {
    void add(AbstractC1123n element);

    void add(byte[] element);

    boolean addAllByteArray(Collection<byte[]> c6);

    boolean addAllByteString(Collection<? extends AbstractC1123n> c6);

    List<byte[]> asByteArrayList();

    byte[] getByteArray(int index);

    AbstractC1123n getByteString(int index);

    Object getRaw(int index);

    List<?> getUnderlyingElements();

    LazyStringList getUnmodifiableView();

    void mergeFrom(LazyStringList other);

    void set(int index, AbstractC1123n element);

    void set(int index, byte[] element);
}
