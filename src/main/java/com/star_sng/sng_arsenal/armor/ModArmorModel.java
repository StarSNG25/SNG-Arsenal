package com.star_sng.sng_arsenal.armor;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@SuppressWarnings("rawtypes")
@OnlyIn(Dist.CLIENT)
public class ModArmorModel extends BipedModel
{
	public ModelRenderer RightSleeve;
	public ModelRenderer RightLegging;
	public ModelRenderer RightBoot;
	public ModelRenderer Helmet;
	public ModelRenderer Chestplate;
	public ModelRenderer LeftSleeve;
	public ModelRenderer LeftLegging;
	public ModelRenderer LeftBoot;
	
	public ModArmorModel(float modelSize)
	{
		super(modelSize);
		this.texWidth = 64;
		this.texHeight = 32;
		this.LeftBoot = new ModelRenderer(this, 0, 13);
		this.LeftBoot.setPos(0.0f, 0.0f, 0.0f);
		this.LeftBoot.texOffs(82, 27).addBox(-3.0f, 8.0f, -3.0f, 1.0f, 4.0f, 6.0f, 0.0f, 0.0f, 0.0f);
		this.LeftBoot.texOffs(104, 31).addBox(-2.0f, 8.0f, 2.0f, 4.0f, 4.0f, 1.0f, 0.0f, 0.0f, 0.0f);
		this.LeftBoot.texOffs(104, 31).addBox(-2.0f, 8.0f, -3.0f, 4.0f, 4.0f, 1.0f, 0.0f, 0.0f, 0.0f);
		this.LeftBoot.texOffs(82, 27).addBox(2.0f, 8.0f, -3.0f, 1.0f, 4.0f, 6.0f, 0.0f, 0.0f, 0.0f);
		this.LeftBoot.texOffs(4, 36).addBox(-2.0f, 11.0f, -2.0f, 4.0f, 1.0f, 4.0f, 0.0f, 0.0f, 0.0f);
		this.setRotateAngle(LeftBoot, 0.0f, 3.141592653589793f, 0.0f);
		this.RightBoot = new ModelRenderer(this, 64, 9);
		this.RightBoot.setPos(0.0F, 0.0F, 0.0F);
		this.RightBoot.texOffs(18, 31).addBox(-3.0F, 8.0F, -3.0F, 1.0F, 4.0F, 6.0F, 0.0F, 0.0F, 0.0F);
		this.RightBoot.texOffs(40, 35).addBox(-2.0F, 8.0F, 2.0F, 4.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
		this.RightBoot.texOffs(40, 35).addBox(-2.0F, 8.0F, -3.0F, 4.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
		this.RightBoot.texOffs(18, 31).addBox(2.0F, 8.0F, -3.0F, 1.0F, 4.0F, 6.0F, 0.0F, 0.0F, 0.0F);
		this.RightBoot.texOffs(-60, 40).addBox(-2.0F, 11.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
		this.Helmet = new ModelRenderer(this, 0, 0);
		this.Helmet.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0f);
		this.Helmet.setPos(-5.0F, -9.0F, -5.0F);
		this.Chestplate = new ModelRenderer(this, 16, 16);
		this.Chestplate.addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0f);
		this.Chestplate.setPos(0.0F, 0.0F, 0.0F);
		this.RightSleeve = new ModelRenderer(this, 40, 16);
		this.RightSleeve.addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0f);
		this.RightSleeve.setPos(0.0F, 0.0F, 0.0F);
		this.LeftSleeve = new ModelRenderer(this, 40, 16);
		this.LeftSleeve.mirror = true;
		this.LeftSleeve.addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0f);
		this.LeftSleeve.setPos(0.0F, 0.0F, 0.0F);
		this.RightLegging = new ModelRenderer(this, 0, 16);
		this.RightLegging.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0f);
		this.RightLegging.setPos(0.0F, 0.0F, 0.0F);
		this.LeftLegging = new ModelRenderer(this, 0, 16);
		this.LeftLegging.mirror = true;
		this.LeftLegging.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0f);
		this.LeftLegging.setPos(0.0F, 0.0F, 0.0F);
	}
	
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packLight, int packOverlay, float red, float green, float blue, float alpha)
	{
		render(matrixStack, buffer, packLight, packOverlay, red, green, blue, alpha);
	}
	
	public void setRotationAngles(LivingEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float headYaw, float headPitch)
	{
		setRotationAngles(entity, limbSwing, limbSwingAmount, ageInTicks, headYaw, headPitch);
		this.Helmet.copyFrom(this.head);
		this.Chestplate.copyFrom(this.body);
		this.LeftSleeve.copyFrom(this.leftArm);
		this.RightSleeve.copyFrom(this.rightArm);
		this.LeftLegging.copyFrom(this.leftLeg);
		this.RightLegging.copyFrom(this.rightLeg);
		this.LeftBoot.copyFrom(this.leftLeg);
		this.RightBoot.copyFrom(this.rightLeg);
	}
	
	public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z)
	{
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}
