package com.transsnet.palmpay.util;

import com.adjust.sdk.Constants;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ShellUtils {
    private static final String LINE_SEP = System.getProperty("line.separator");

    public static class CommandResult {
        public String errorMsg;
        public int result;
        public String successMsg;

        public CommandResult(int i7, String str, String str2) {
            this.result = i7;
            this.successMsg = str;
            this.errorMsg = str2;
        }
    }

    private ShellUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static CommandResult execCmd(String str, boolean z3) {
        return execCmd(new String[]{str}, z3, true);
    }

    public static CommandResult execCmd(List<String> list, boolean z3) {
        return execCmd(list == null ? null : (String[]) list.toArray(new String[0]), z3, true);
    }

    public static CommandResult execCmd(String[] strArr, boolean z3) {
        return execCmd(strArr, z3, true);
    }

    public static CommandResult execCmd(String str, boolean z3, boolean z8) {
        return execCmd(new String[]{str}, z3, z8);
    }

    public static CommandResult execCmd(List<String> list, boolean z3, boolean z8) {
        return execCmd(list == null ? null : (String[]) list.toArray(new String[0]), z3, z8);
    }

    /* JADX WARN: Code duplicated, block: B:73:0x0117  */
    /* JADX WARN: Code duplicated, block: B:77:0x012b  */
    /* JADX WARN: Code duplicated, block: B:81:0x0134  */
    /* JADX WARN: Code duplicated, block: B:82:0x0136  */
    /* JADX WARN: Code duplicated, block: B:85:0x013d  */
    /* JADX WARN: Code duplicated, block: B:92:0x0156  */
    /* JADX WARN: Multi-variable type inference failed */
    public static CommandResult execCmd(String[] strArr, boolean z3, boolean z8) throws Throwable {
        Process processExecCmd;
        Object obj;
        StringBuilder sb2;
        Process process;
        StringBuilder sb3;
        Object obj2;
        StringBuilder sb4;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        StringBuilder sb5;
        StringBuilder sb6;
        String string;
        DataOutputStream dataOutputStream;
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2;
        Object obj11 = null;
        int iWaitFor = -1;
        if (strArr != null && strArr.length != 0) {
            try {
                processExecCmd = execCmd(z3 ? "su" : "sh");
                if (processExecCmd != null) {
                    try {
                        dataOutputStream = new DataOutputStream(processExecCmd.getOutputStream());
                        try {
                            try {
                                for (String str : strArr) {
                                    if (str != null) {
                                        dataOutputStream.write(str.getBytes());
                                        dataOutputStream.writeBytes(LINE_SEP);
                                        dataOutputStream.flush();
                                    }
                                }
                                dataOutputStream.writeBytes("exit" + LINE_SEP);
                                dataOutputStream.flush();
                                iWaitFor = processExecCmd.waitFor();
                                if (z8) {
                                    sb5 = new StringBuilder();
                                    try {
                                        sb6 = new StringBuilder();
                                        try {
                                            bufferedReader = new BufferedReader(new InputStreamReader(processExecCmd.getInputStream(), Constants.ENCODING));
                                            try {
                                                bufferedReader2 = new BufferedReader(new InputStreamReader(processExecCmd.getErrorStream(), Constants.ENCODING));
                                                try {
                                                    String line = bufferedReader.readLine();
                                                    if (line != null) {
                                                        sb5.append(line);
                                                        while (true) {
                                                            String line2 = bufferedReader.readLine();
                                                            if (line2 == null) {
                                                                break;
                                                            }
                                                            sb5.append(LINE_SEP);
                                                            sb5.append(line2);
                                                        }
                                                    }
                                                    String line3 = bufferedReader2.readLine();
                                                    if (line3 != null) {
                                                        sb6.append(line3);
                                                        while (true) {
                                                            String line4 = bufferedReader2.readLine();
                                                            if (line4 == null) {
                                                                break;
                                                            }
                                                            sb6.append(LINE_SEP);
                                                            sb6.append(line4);
                                                        }
                                                    }
                                                } catch (Exception e10) {
                                                    sb2 = sb5;
                                                    e = e10;
                                                    sb3 = sb6;
                                                    process = processExecCmd;
                                                    obj10 = dataOutputStream;
                                                    obj9 = bufferedReader;
                                                    obj4 = bufferedReader2;
                                                    try {
                                                        e.printStackTrace();
                                                        CloseUtils.closeIO(obj10, obj9, obj4);
                                                        if (process != null) {
                                                            process.destroy();
                                                        }
                                                        sb5 = sb2;
                                                        sb6 = sb3;
                                                    } catch (Throwable th) {
                                                        th = th;
                                                        processExecCmd = process;
                                                        obj8 = obj10;
                                                        obj7 = obj9;
                                                        obj6 = obj4;
                                                        obj11 = obj8;
                                                        obj5 = obj7;
                                                        obj2 = obj6;
                                                        CloseUtils.closeIO(obj11, obj5, obj2);
                                                        if (processExecCmd != null) {
                                                            processExecCmd.destroy();
                                                        }
                                                        throw th;
                                                    }
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    obj8 = dataOutputStream;
                                                    obj7 = bufferedReader;
                                                    obj6 = bufferedReader2;
                                                    obj11 = obj8;
                                                    obj5 = obj7;
                                                    obj2 = obj6;
                                                    CloseUtils.closeIO(obj11, obj5, obj2);
                                                    if (processExecCmd != null) {
                                                        processExecCmd.destroy();
                                                    }
                                                    throw th;
                                                }
                                            } catch (Exception e11) {
                                                sb2 = sb5;
                                                e = e11;
                                                sb3 = sb6;
                                                process = processExecCmd;
                                                obj4 = null;
                                                obj10 = dataOutputStream;
                                                obj9 = bufferedReader;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                obj6 = null;
                                                obj8 = dataOutputStream;
                                                obj7 = bufferedReader;
                                            }
                                        } catch (Exception e12) {
                                            sb2 = sb5;
                                            e = e12;
                                            sb3 = sb6;
                                            process = processExecCmd;
                                            sb4 = null;
                                            obj3 = dataOutputStream;
                                            obj4 = sb4;
                                            obj10 = obj3;
                                            obj9 = sb4;
                                            e.printStackTrace();
                                            CloseUtils.closeIO(obj10, obj9, obj4);
                                            if (process != null) {
                                                process.destroy();
                                            }
                                            sb5 = sb2;
                                            sb6 = sb3;
                                            if (sb5 == null) {
                                                string = null;
                                            } else {
                                                string = sb5.toString();
                                            }
                                            return new CommandResult(iWaitFor, string, sb6 != null ? sb6.toString() : null);
                                        }
                                    } catch (Exception e13) {
                                        sb2 = sb5;
                                        e = e13;
                                        process = processExecCmd;
                                        sb3 = null;
                                        sb4 = sb3;
                                        obj3 = dataOutputStream;
                                        obj4 = sb4;
                                        obj10 = obj3;
                                        obj9 = sb4;
                                        e.printStackTrace();
                                        CloseUtils.closeIO(obj10, obj9, obj4);
                                        if (process != null) {
                                            process.destroy();
                                        }
                                        sb5 = sb2;
                                        sb6 = sb3;
                                        if (sb5 == null) {
                                            string = null;
                                        } else {
                                            string = sb5.toString();
                                        }
                                        return new CommandResult(iWaitFor, string, sb6 != null ? sb6.toString() : null);
                                    }
                                } else {
                                    sb5 = null;
                                    sb6 = null;
                                    bufferedReader = null;
                                    dataOutputStream = dataOutputStream;
                                }
                                CloseUtils.closeIO(dataOutputStream, bufferedReader, bufferedReader2);
                                if (processExecCmd != null) {
                                    processExecCmd.destroy();
                                }
                            } catch (Exception e14) {
                                e = e14;
                                process = processExecCmd;
                                sb2 = null;
                                sb3 = null;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            obj7 = null;
                            obj6 = null;
                            obj8 = dataOutputStream;
                        }
                    } catch (Exception e15) {
                        e = e15;
                        process = processExecCmd;
                        sb2 = null;
                        sb3 = null;
                        StringBuilder sb7 = sb3;
                        sb4 = sb7;
                        obj3 = sb7;
                        obj4 = sb4;
                        obj10 = obj3;
                        obj9 = sb4;
                        e.printStackTrace();
                        CloseUtils.closeIO(obj10, obj9, obj4);
                        if (process != null) {
                            process.destroy();
                        }
                        sb5 = sb2;
                        sb6 = sb3;
                        if (sb5 == null) {
                            string = null;
                        } else {
                            string = sb5.toString();
                        }
                        return new CommandResult(iWaitFor, string, sb6 != null ? sb6.toString() : null);
                    } catch (Throwable th5) {
                        th = th5;
                        obj = null;
                        obj2 = obj;
                        obj5 = obj;
                        CloseUtils.closeIO(obj11, obj5, obj2);
                        if (processExecCmd != null) {
                            processExecCmd.destroy();
                        }
                        throw th;
                    }
                    if (sb5 == null) {
                        string = null;
                    } else {
                        string = sb5.toString();
                    }
                    return new CommandResult(iWaitFor, string, sb6 != null ? sb6.toString() : null);
                }
                sb5 = null;
                sb6 = null;
                dataOutputStream = null;
                bufferedReader = null;
                bufferedReader2 = bufferedReader;
                CloseUtils.closeIO(dataOutputStream, bufferedReader, bufferedReader2);
                if (processExecCmd != null) {
                    processExecCmd.destroy();
                }
            } catch (Exception e16) {
                e = e16;
                sb2 = null;
                process = null;
                sb3 = null;
            } catch (Throwable th6) {
                th = th6;
                processExecCmd = null;
                obj = null;
            }
            if (sb5 == null) {
                string = null;
            } else {
                string = sb5.toString();
            }
            return new CommandResult(iWaitFor, string, sb6 != null ? sb6.toString() : null);
        }
        return new CommandResult(-1, null, null);
    }

    public static Process execCmd(String str) throws Exception {
        try {
            Object objInvoke = Class.forName("java.lang.Runtime").getMethod("exec", String.class).invoke(Class.forName("java.lang.Runtime").getMethod("getRuntime", new Class[0]).invoke(null, new Object[0]), str);
            if (objInvoke instanceof Process) {
                return (Process) objInvoke;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return null;
    }
}
