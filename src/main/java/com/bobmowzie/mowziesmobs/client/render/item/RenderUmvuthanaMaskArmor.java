package com.bobmowzie.mowziesmobs.client.render.item;

import com.bobmowzie.mowziesmobs.client.model.armor.UmvuthanaMaskModel;
import com.bobmowzie.mowziesmobs.client.render.entity.MowzieGeoArmorRenderer;
import com.bobmowzie.mowziesmobs.server.item.ItemUmvuthanaMask;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib.renderer.layer.AutoGlowingGeoLayer;

public class RenderUmvuthanaMaskArmor extends MowzieGeoArmorRenderer<ItemUmvuthanaMask> {

    public RenderUmvuthanaMaskArmor() {
        super(new UmvuthanaMaskModel());
    }
}
