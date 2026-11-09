package androidx.datastore.preferences.protobuf;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface DescriptorProtos$SourceCodeInfo$LocationOrBuilder extends MessageLiteOrBuilder {
    String getLeadingComments();

    AbstractC1123n getLeadingCommentsBytes();

    String getLeadingDetachedComments(int index);

    AbstractC1123n getLeadingDetachedCommentsBytes(int index);

    int getLeadingDetachedCommentsCount();

    List<String> getLeadingDetachedCommentsList();

    int getPath(int index);

    int getPathCount();

    List<Integer> getPathList();

    int getSpan(int index);

    int getSpanCount();

    List<Integer> getSpanList();

    String getTrailingComments();

    AbstractC1123n getTrailingCommentsBytes();

    boolean hasLeadingComments();

    boolean hasTrailingComments();
}
