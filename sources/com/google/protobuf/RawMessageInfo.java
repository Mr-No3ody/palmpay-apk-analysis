package com.google.protobuf;

/* JADX INFO: loaded from: classes3.dex */
@CheckReturnValue
final class RawMessageInfo implements MessageInfo {
    private static final int IS_EDITION_BIT = 4;
    private static final int IS_PROTO2_BIT = 1;
    private final MessageLite defaultInstance;
    private final int flags;
    private final String info;
    private final Object[] objects;

    public RawMessageInfo(MessageLite defaultInstance, String info, Object[] objects) {
        this.defaultInstance = defaultInstance;
        this.info = info;
        this.objects = objects;
        char cCharAt = info.charAt(0);
        if (cCharAt < 55296) {
            this.flags = cCharAt;
            return;
        }
        int i7 = cCharAt & 8191;
        int i10 = 13;
        int i11 = 1;
        while (true) {
            int i12 = i11 + 1;
            char cCharAt2 = info.charAt(i11);
            if (cCharAt2 < 55296) {
                this.flags = i7 | (cCharAt2 << i10);
                return;
            } else {
                i7 |= (cCharAt2 & 8191) << i10;
                i10 += 13;
                i11 = i12;
            }
        }
    }

    @Override // com.google.protobuf.MessageInfo
    public MessageLite getDefaultInstance() {
        return this.defaultInstance;
    }

    public Object[] getObjects() {
        return this.objects;
    }

    public String getStringInfo() {
        return this.info;
    }

    @Override // com.google.protobuf.MessageInfo
    public ProtoSyntax getSyntax() {
        int i7 = this.flags;
        if ((i7 & 1) != 0) {
            return ProtoSyntax.PROTO2;
        }
        return (i7 & 4) == 4 ? ProtoSyntax.EDITIONS : ProtoSyntax.PROTO3;
    }

    @Override // com.google.protobuf.MessageInfo
    public boolean isMessageSetWireFormat() {
        return (this.flags & 2) == 2;
    }
}
