package com.palmpay.init.annotation;

import com.facebook.react.modules.appstate.AppStateModule;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C1850q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\n\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0002\u0010\rJ\u0011\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u0000H\u0096\u0002J\u0013\u0010\u001f\u001a\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010 H\u0096\u0002J\b\u0010!\u001a\u00020\bH\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00000\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017¨\u0006\""}, d2 = {"Lcom/palmpay/init/annotation/TaskInfo;", "", "name", "", "group", AppStateModule.APP_STATE_BACKGROUND, "", "priority", "", "process", "", "depends", "taskClassName", "(Ljava/lang/String;Ljava/lang/String;ZI[Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)V", "getBackground", "()Z", "children", "", "getChildren", "()Ljava/util/Set;", "", "getDepends", "getGroup", "()Ljava/lang/String;", "getName", "getPriority", "()I", "getProcess", "getTaskClassName", "compareTo", "other", "equals", "", "hashCode", "init-annotation"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TaskInfo implements Comparable<TaskInfo> {
    private final boolean background;

    @NotNull
    private final Set<TaskInfo> children;

    @Nullable
    private final Set<String> depends;

    @NotNull
    private final String group;

    @NotNull
    private final String name;
    private final int priority;

    @NotNull
    private final Set<String> process;

    @NotNull
    private final String taskClassName;

    public TaskInfo(@NotNull String name, @NotNull String group, boolean z3, int i7, @NotNull String[] process, @NotNull String[] depends, @NotNull String taskClassName) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(process, "process");
        Intrinsics.checkNotNullParameter(depends, "depends");
        Intrinsics.checkNotNullParameter(taskClassName, "taskClassName");
        this.name = name;
        this.group = group;
        this.background = z3;
        this.priority = i7;
        this.taskClassName = taskClassName;
        this.children = new LinkedHashSet();
        this.depends = new HashSet(C1850q.h(Arrays.copyOf(depends, depends.length)));
        this.process = new HashSet(C1850q.h(Arrays.copyOf(process, process.length)));
    }

    public boolean equals(@Nullable Object other) {
        return (other instanceof TaskInfo) && Intrinsics.c(((TaskInfo) other).name, this.name);
    }

    public final boolean getBackground() {
        return this.background;
    }

    @NotNull
    public final Set<TaskInfo> getChildren() {
        return this.children;
    }

    @Nullable
    public final Set<String> getDepends() {
        return this.depends;
    }

    @NotNull
    public final String getGroup() {
        return this.group;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final int getPriority() {
        return this.priority;
    }

    @NotNull
    public final Set<String> getProcess() {
        return this.process;
    }

    @NotNull
    public final String getTaskClassName() {
        return this.taskClassName;
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    @Override // java.lang.Comparable
    public int compareTo(@NotNull TaskInfo other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return Intrinsics.h(this.priority, other.priority);
    }
}
