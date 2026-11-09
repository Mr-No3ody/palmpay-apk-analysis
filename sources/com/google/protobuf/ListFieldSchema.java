package com.google.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@CheckReturnValue
abstract class ListFieldSchema {
    private static final ListFieldSchema FULL_INSTANCE;
    private static final ListFieldSchema LITE_INSTANCE;

    public static final class ListFieldSchemaFull extends ListFieldSchema {
        private static final Class<?> UNMODIFIABLE_LIST_CLASS = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

        private ListFieldSchemaFull() {
            super();
        }

        public static <E> List<E> getList(Object message, long offset) {
            return (List) UnsafeUtil.getObject(message, offset);
        }

        @Override // com.google.protobuf.ListFieldSchema
        public void makeImmutableListAt(Object message, long offset) {
            Object objUnmodifiableList;
            List list = (List) UnsafeUtil.getObject(message, offset);
            if (list instanceof LazyStringList) {
                objUnmodifiableList = ((LazyStringList) list).getUnmodifiableView();
            } else {
                if (UNMODIFIABLE_LIST_CLASS.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof PrimitiveNonBoxingCollection) && (list instanceof Internal.ProtobufList)) {
                    Internal.ProtobufList protobufList = (Internal.ProtobufList) list;
                    if (protobufList.isModifiable()) {
                        protobufList.makeImmutable();
                        return;
                    }
                    return;
                }
                objUnmodifiableList = Collections.unmodifiableList(list);
            }
            UnsafeUtil.putObject(message, offset, objUnmodifiableList);
        }

        @Override // com.google.protobuf.ListFieldSchema
        public <E> void mergeListsAt(Object msg, Object otherMsg, long offset) {
            List list = getList(otherMsg, offset);
            List listMutableListAt = mutableListAt(msg, offset, list.size());
            int size = listMutableListAt.size();
            int size2 = list.size();
            if (size > 0 && size2 > 0) {
                listMutableListAt.addAll(list);
            }
            if (size > 0) {
                list = listMutableListAt;
            }
            UnsafeUtil.putObject(msg, offset, list);
        }

        @Override // com.google.protobuf.ListFieldSchema
        public <L> List<L> mutableListAt(Object message, long offset) {
            return mutableListAt(message, offset, 10);
        }

        private static <L> List<L> mutableListAt(Object message, long offset, int additionalCapacity) {
            List<L> listMutableCopyWithCapacity2;
            List<L> list = getList(message, offset);
            if (list.isEmpty()) {
                if (list instanceof LazyStringList) {
                    listMutableCopyWithCapacity2 = new LazyStringArrayList(additionalCapacity);
                } else {
                    listMutableCopyWithCapacity2 = ((list instanceof PrimitiveNonBoxingCollection) && (list instanceof Internal.ProtobufList)) ? ((Internal.ProtobufList) list).mutableCopyWithCapacity2(additionalCapacity) : new ArrayList<>(additionalCapacity);
                }
                UnsafeUtil.putObject(message, offset, listMutableCopyWithCapacity2);
                return listMutableCopyWithCapacity2;
            }
            if (UNMODIFIABLE_LIST_CLASS.isAssignableFrom(list.getClass())) {
                ArrayList arrayList = new ArrayList(list.size() + additionalCapacity);
                arrayList.addAll(list);
                UnsafeUtil.putObject(message, offset, arrayList);
                return arrayList;
            }
            if (list instanceof UnmodifiableLazyStringList) {
                LazyStringArrayList lazyStringArrayList = new LazyStringArrayList(list.size() + additionalCapacity);
                lazyStringArrayList.addAll((UnmodifiableLazyStringList) list);
                UnsafeUtil.putObject(message, offset, lazyStringArrayList);
                return lazyStringArrayList;
            }
            if ((list instanceof PrimitiveNonBoxingCollection) && (list instanceof Internal.ProtobufList)) {
                Internal.ProtobufList protobufList = (Internal.ProtobufList) list;
                if (!protobufList.isModifiable()) {
                    Internal.ProtobufList protobufListMutableCopyWithCapacity2 = protobufList.mutableCopyWithCapacity2(list.size() + additionalCapacity);
                    UnsafeUtil.putObject(message, offset, protobufListMutableCopyWithCapacity2);
                    return protobufListMutableCopyWithCapacity2;
                }
            }
            return list;
        }
    }

    public static final class ListFieldSchemaLite extends ListFieldSchema {
        private ListFieldSchemaLite() {
            super();
        }

        public static <E> Internal.ProtobufList<E> getProtobufList(Object message, long offset) {
            return (Internal.ProtobufList) UnsafeUtil.getObject(message, offset);
        }

        @Override // com.google.protobuf.ListFieldSchema
        public void makeImmutableListAt(Object message, long offset) {
            getProtobufList(message, offset).makeImmutable();
        }

        @Override // com.google.protobuf.ListFieldSchema
        public <E> void mergeListsAt(Object msg, Object otherMsg, long offset) {
            Internal.ProtobufList protobufList = getProtobufList(msg, offset);
            Internal.ProtobufList protobufList2 = getProtobufList(otherMsg, offset);
            int size = protobufList.size();
            int size2 = protobufList2.size();
            if (size > 0 && size2 > 0) {
                if (!protobufList.isModifiable()) {
                    protobufList = protobufList.mutableCopyWithCapacity2(size2 + size);
                }
                protobufList.addAll(protobufList2);
            }
            if (size > 0) {
                protobufList2 = protobufList;
            }
            UnsafeUtil.putObject(msg, offset, protobufList2);
        }

        @Override // com.google.protobuf.ListFieldSchema
        public <L> List<L> mutableListAt(Object message, long offset) {
            Internal.ProtobufList protobufList = getProtobufList(message, offset);
            if (protobufList.isModifiable()) {
                return protobufList;
            }
            int size = protobufList.size();
            Internal.ProtobufList protobufListMutableCopyWithCapacity2 = protobufList.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
            UnsafeUtil.putObject(message, offset, protobufListMutableCopyWithCapacity2);
            return protobufListMutableCopyWithCapacity2;
        }
    }

    static {
        FULL_INSTANCE = new ListFieldSchemaFull();
        LITE_INSTANCE = new ListFieldSchemaLite();
    }

    public static ListFieldSchema full() {
        return FULL_INSTANCE;
    }

    public static ListFieldSchema lite() {
        return LITE_INSTANCE;
    }

    public abstract void makeImmutableListAt(Object msg, long offset);

    public abstract <L> void mergeListsAt(Object msg, Object otherMsg, long offset);

    public abstract <L> List<L> mutableListAt(Object msg, long offset);

    private ListFieldSchema() {
    }
}
