package uwu.narumi.deobfuscator.transformer.impl.eskid;

import org.objectweb.asm.tree.*;
import uwu.narumi.deobfuscator.Deobfuscator;
import uwu.narumi.deobfuscator.transformer.Transformer;

import java.util.ArrayList;

public class EskidFlowTransformer extends Transformer {
    @Override
    public void transform(Deobfuscator deobfuscator) throws Exception {
        for (ClassNode cn : deobfuscator.classes()) {
            ArrayList<AbstractInsnNode> insnNodes = new ArrayList<>();
            ArrayList<AbstractInsnNode> removeNodes = new ArrayList<>();

            for (MethodNode method : cn.methods) {
                ArrayList<LabelNode> labelNodes = new ArrayList<>();
/*                ArrayList<LabelNode> labelNodes = new ArrayList<>();
                for (int i = 0; i < method.instructions.toArray().length; i++) {
                    AbstractInsnNode insn = method.instructions.get(i);
                    if (insn instanceof LabelNode) {
                        labelNodes.add((LabelNode) insn);
                    }
                }*/

                //删除if break块
/*                for (int i = 0; i < method.instructions.toArray().length; i++) {
                    AbstractInsnNode insn = method.instructions.get(i);
                    if (method.instructions.toArray().length > i + 7) {
                        if (insn.getOpcode() == GETSTATIC && method.instructions.get(i + 1) instanceof JumpInsnNode) {
                            AbstractInsnNode ifInsn = method.instructions.get(i + 1);
                            LabelNode label = ((JumpInsnNode) ifInsn).label;
                            if (label.getNext() != null && label.getNext().getNext() != null) {
                                if (label.getNext().getOpcode() == ACONST_NULL && label.getNext().getNext().getOpcode() == ATHROW) {
                                    removeNodes.add(insn);
                                    removeNodes.add(ifInsn);
                                    removeNodes.add(label);
                                    removeNodes.add(label.getNext());
                                    removeNodes.add(label.getNext().getNext());
                                }
                            }
                        }
                        if (insn.getOpcode() == ALOAD
                                && method.instructions.get(i + 1).getOpcode() == GETFIELD
                                && method.instructions.get(i + 3).getOpcode() == CHECKCAST
                                && isInteger(method.instructions.get(i + 5))
                                && method.instructions.get(i + 6) instanceof InsnNode
                                && method.instructions.get(i + 7) instanceof JumpInsnNode) {
                            for (int i1 = 0; i1 < 8; i1++) {
                                removeNodes.add(method.instructions.get(i + i1));
                            }
                        }
                    }
                }*/

                for (int i = 0; i < method.instructions.toArray().length; i++) {
                    AbstractInsnNode insn = method.instructions.get(i);
                    if (insn instanceof LabelNode) {
                        labelNodes.add((LabelNode) insn);
                    }
                }

                //删除垃圾
                for (int i = 0; i < method.instructions.toArray().length; i++) {
                    if (method.instructions.toArray().length > i + 1) {
                        AbstractInsnNode insn = method.instructions.get(i);
                        AbstractInsnNode insn2 = method.instructions.get(i + 1);
                        if (insn.getOpcode() == GETSTATIC && insn2 instanceof JumpInsnNode) {
                            if (!labelNodes.contains(((JumpInsnNode) insn2).label)) {
                                removeNodes.add(insn);
                                removeNodes.add(insn2);
                            }
                        }
                        if (isInteger(insn) && insn2 instanceof JumpInsnNode) {
                            if (!labelNodes.contains(((JumpInsnNode) insn2).label)) {
                                removeNodes.add(insn);
                                removeNodes.add(insn2);
                            }
                        }
                    }
                    AbstractInsnNode insn = method.instructions.get(i);
                    if (insn.getOpcode() == GOTO) {
                        JumpInsnNode gotoNode = (JumpInsnNode) insn;
                        if (!labelNodes.contains(gotoNode.label)) {
                            method.instructions.set(gotoNode, new InsnNode(RETURN));
                        }
                        if (labelNodes.size() > 0) {
                            if (gotoNode.label == labelNodes.get(0)) {
                                method.instructions.set(gotoNode, new InsnNode(RETURN));
                            }
                        }
                    }
                }
//删除傻逼垃圾块lIIllllI
                //lIIllllI

                for (int i = 0; i < method.instructions.toArray().length; i++) {
                    if (method.instructions.toArray().length > i + 2) {
                        AbstractInsnNode insn = method.instructions.get(i);
                        AbstractInsnNode insn2 = method.instructions.get(i + 1);
                        if (insn.getOpcode() == GETSTATIC && insn2 instanceof JumpInsnNode) {
                            if (((JumpInsnNode) insn2).label == method.instructions.get(i + 2)) {
                                for (int i1 = 0; i1 < 3; i1++) {
                                    removeNodes.add(method.instructions.get(i + i1));
                                }
                            }
                        }
                        if (isInteger(insn) && insn2 instanceof JumpInsnNode) {
                            if (((JumpInsnNode) insn2).label == method.instructions.get(i + 2)) {
                                for (int i1 = 0; i1 < 3; i1++) {
                                    removeNodes.add(method.instructions.get(i + i1));
                                }
                            }
                        }
/*                        if (insn.getOpcode() == DUP && insn2.getOpcode() == ATHROW) {
                            for (int i1 = 0; i1 < 3; i1++) {
                                removeNodes.add(method.instructions.get(i + i1));
                            }
                        }
                        if (insn.getOpcode() == GETSTATIC && insn2.getOpcode() == GETSTATIC && athorw.getOpcode() == ACONST_NULL) {
                            for (int i1 = 0; i1 < 4; i1++) {
                                removeNodes.add(method.instructions.get(i + i1));
                            }
                        }
                        if (insn.getOpcode() == DUP && insn2 instanceof JumpInsnNode && athorw.getOpcode() == ATHROW) {
                            for (int i1 = 0; i1 < 4; i1++) {
                                removeNodes.add(method.instructions.get(i + i1));
                            }
                        }*/
                    }
                }


                for (AbstractInsnNode instruction : method.instructions) {
                    if (removeNodes.contains(instruction)) {
                        method.instructions.remove(instruction);
                    }
                }
            }
        }
    }

    /*                for (int i = 0; i < method.instructions.toArray().length; i++) {
                    AbstractInsnNode insn = method.instructions.get(i);
                    if (method.instructions.toArray().length > i + 3) {
                        AbstractInsnNode ifInsn = method.instructions.get(i + 1);
                        AbstractInsnNode aconstNull = method.instructions.get(i + 2);
                        AbstractInsnNode athrow = method.instructions.get(i + 3);
                        if (isInteger(insn) && ifInsn instanceof JumpInsnNode && aconstNull.getOpcode() == ACONST_NULL && athrow.getOpcode() == ATHROW) {
                            for (int i1 = 0; i1 < 4; i1++) {
                                removeNodes.add(method.instructions.get(i + i1));
                            }
                        }
                    }
                }*/

    /*

                    //删除if break块
                for (int i = 0; i < method.instructions.toArray().length; i++) {
                    AbstractInsnNode insn = method.instructions.get(i);
                    if (method.instructions.toArray().length > i + 7) {
                        if (insn.getOpcode() == GETSTATIC && method.instructions.get(i + 1) instanceof JumpInsnNode) {
                            AbstractInsnNode ifInsn = method.instructions.get(i + 1);
                            LabelNode label = ((JumpInsnNode) ifInsn).label;
                            if (label.getNext() != null && label.getNext().getNext() != null) {
                                if (label.getNext().getOpcode() == ACONST_NULL && label.getNext().getNext().getOpcode() == ATHROW) {
                                    removeNodes.add(insn);
                                    removeNodes.add(ifInsn);
                                    removeNodes.add(label);
                                    removeNodes.add(label.getNext());
                                    removeNodes.add(label.getNext().getNext());
                                }
                            }
                        }
                        if (insn.getOpcode() == ALOAD
                                && method.instructions.get(i + 1).getOpcode() == GETFIELD
                                && method.instructions.get(i + 3).getOpcode() == CHECKCAST
                                && isInteger(method.instructions.get(i + 5))
                                && method.instructions.get(i + 6) instanceof InsnNode
                                && method.instructions.get(i + 7) instanceof JumpInsnNode) {
                            for (int i1 = 0; i1 < 8; i1++) {
                                removeNodes.add(method.instructions.get(i + i1));
                            }
                        }
                    }
                }
    * */

    /*                    if (isInteger(insn)) {
                        if (method.instructions.toArray().length > i + 1) {
                            AbstractInsnNode ifInsn = method.instructions.get(i + 1);
                            if (ifInsn instanceof JumpInsnNode) {
                                LabelNode label = ((JumpInsnNode) ifInsn).label;
                                if (label.getNext() != null && label.getNext().getNext() != null) {
                                    if (label.getNext().getOpcode() == ACONST_NULL && label.getNext().getNext().getOpcode() == ATHROW) {
                                        System.out.println("cnm");
                                        removeNodes.add(insn);
                                        removeNodes.add(ifInsn);
                                        removeNodes.add(label);
                                        removeNodes.add(label.getNext());
                                        removeNodes.add(label.getNext().getNext());
                                    }
                                }
                            }
                        }
                    }*/
/*                    if (method.instructions.toArray().length > i + 4) {
                        AbstractInsnNode ifInsn = method.instructions.get(i + 1);
                        AbstractInsnNode gotoInsn = method.instructions.get(i + 4);
//                        AbstractInsnNode egotoInsn = method.instructions.get(i + 5);
                        if (isInteger(insn) && ifInsn instanceof JumpInsnNode && gotoInsn.getOpcode() == GOTO) {
                            for (int i1 = 0; i1 < 5; i1++) {
                                removeNodes.add(method.instructions.get(i + i1));
                            }
                        }
                    }*/
    //解密没用的if块
    /*                    if (method.instructions.toArray().length > i + 4) {
                        AbstractInsnNode ifInsn = method.instructions.get(i + 2);
                        AbstractInsnNode gotoInsn = method.instructions.get(i + 4);
                        if ((insn instanceof IntInsnNode || insn instanceof LdcInsnNode) && ifInsn instanceof JumpInsnNode && gotoInsn.getOpcode() == GOTO) {
                            for (int i1 = 0; i1 < 5; i1++) {
                                removeNodes.add(method.instructions.get(i + i1));
                            }
                        }
                    }*/

/*    private void removeReplaceReturn() {
        for (int i = 0; i < method.instructions.toArray().length; i++) {
            if (labelNodes.size() > 0) {
                LabelNode labelNode = labelNodes.get(0);
                AbstractInsnNode next = labelNode.getNext();
                if (next.getOpcode() == RETURN) {
                    AbstractInsnNode insn = method.instructions.get(i);
                    if (insn instanceof JumpInsnNode) {
                        JumpInsnNode jumpInsnNode = (JumpInsnNode) insn;
                        if (labelNode == jumpInsnNode.label) {
                            insnNodes.add(labelNode);
                            insnNodes.add(next);
                            insnNodes.add(jumpInsnNode);
                        }
                    }
                }
            }
        }
        for (AbstractInsnNode instruction : method.instructions) {
            if (insnNodes.contains(instruction)) {
                method.instructions.remove(instruction);
            }
        }
    }*/
}
