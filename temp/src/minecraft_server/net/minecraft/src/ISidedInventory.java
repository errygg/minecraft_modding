package net.minecraft.src;

import net.minecraft.src.IInventory;
import net.minecraft.src.ItemStack;

public interface ISidedInventory extends IInventory {

   int[] func_94128_d(int var1);

   boolean func_102007_a(int var1, ItemStack var2, int var3);

   boolean func_102008_b(int var1, ItemStack var2, int var3);
}
