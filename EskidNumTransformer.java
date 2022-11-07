package uwu.narumi.deobfuscator.transformer.impl.eskid;

import org.objectweb.asm.tree.*;
import uwu.narumi.deobfuscator.Deobfuscator;
import uwu.narumi.deobfuscator.transformer.Transformer;

import java.util.ArrayList;

public class EskidNumTransformer extends Transformer {
    @Override
    public void transform(Deobfuscator deobfuscator) throws Exception {
        for (ClassNode cn : deobfuscator.classes()) {
            for (MethodNode method : cn.methods) {
                ArrayList<AbstractInsnNode> removeNodes = new ArrayList<>();
                for (int i = 0; i < method.instructions.toArray().length; i++) {
                    AbstractInsnNode insn = method.instructions.get(i);
                    if (method.instructions.toArray().length > i + 5) {
                        AbstractInsnNode castInsn = method.instructions.get(i + 5);
                        AbstractInsnNode numInsn = method.instructions.get(i + 2);
                        if (isInteger(insn) && isInteger(numInsn) && castInsn.getOpcode() == L2I) {
                            for (int i1 = 1; i1 < 6; i1++) {
                                removeNodes.add(method.instructions.get(i + i1));
                            }

                        }
                    }
                    if (method.instructions.toArray().length > i + 3) {
                        AbstractInsnNode i2lInsn = method.instructions.get(i + 1);
                        AbstractInsnNode numInsn = method.instructions.get(i + 2);
                        AbstractInsnNode xorInsn = method.instructions.get(i + 3);
                        if (isInteger(insn) && isLong(numInsn) && i2lInsn instanceof InsnNode && xorInsn.getOpcode() == LXOR) {
                            for (int i1 = 1; i1 < 4; i1++) {
                                removeNodes.add(method.instructions.get(i + i1));
                            }
                            method.instructions.set(insn, new LdcInsnNode(getInteger(insn) ^ getLong(numInsn)));
                        }
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
}
