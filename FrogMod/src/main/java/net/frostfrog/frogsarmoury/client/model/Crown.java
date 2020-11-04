package net.frostfrog.frogsarmoury.client.model;

import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.ResourceLocation;

public class Crown extends ArmorBaseModel
{
	public Crown()
	{
		super(64, 64, new ResourceLocation("frogsarmoury", "textures/models/armor/crown.png"));
	}

	@Override
	public void setupArmorParts()
	{
		final ModelRenderer cube_r1;

		armorHead = new ModelRenderer(this);
		armorHead.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedHead.addChild(armorHead);
		armorHead.setTextureOffset(0, 0).addBox(-5.0F, -7.0F, -5.0F, 10.0F, 1.0F, 10.0F, 0.0F, false);
		armorHead.setTextureOffset(0, 13).addBox(-4.0F, -8.0F, -5.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);
		armorHead.setTextureOffset(0, 11).addBox(-4.0F, -8.0F, 4.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);
		armorHead.setTextureOffset(0, 15).addBox(-3.0F, -9.0F, -5.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		armorHead.setTextureOffset(0, 0).addBox(-2.0F, -10.0F, -5.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		armorHead.setTextureOffset(17, 17).addBox(-5.0F, -9.0F, -4.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		armorHead.setTextureOffset(14, 15).addBox(4.0F, -9.0F, -4.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		armorHead.setTextureOffset(8, 17).addBox(-5.0F, -9.0F, 2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		armorHead.setTextureOffset(0, 5).addBox(4.0F, -9.0F, 2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		armorHead.setTextureOffset(4, 17).addBox(-5.0F, -9.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		armorHead.setTextureOffset(4, 5).addBox(4.0F, -9.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		armorHead.setTextureOffset(0, 17).addBox(-5.0F, -9.0F, -2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		armorHead.setTextureOffset(6, 2).addBox(4.0F, -9.0F, -2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, -8.25F, -5.0F);
		armorHead.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.7854F);
		cube_r1.setTextureOffset(0, 2).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);

		armorBody = new ModelRenderer(this);
		armorBody.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedBody.addChild(armorBody);

		armorRightArm = new ModelRenderer(this);
		armorRightArm.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedRightArm.addChild(armorRightArm);

		armorLeftArm = new ModelRenderer(this);
		armorLeftArm.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedLeftArm.addChild(armorLeftArm);

		armorRightLeg = new ModelRenderer(this);
		armorRightLeg.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedRightLeg.addChild(armorRightLeg);

		armorRightBoot = new ModelRenderer(this);
		armorRightBoot.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedRightLeg.addChild(armorRightBoot);

		armorLeftLeg = new ModelRenderer(this);
		armorLeftLeg.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedLeftLeg.addChild(armorLeftLeg);

		armorLeftBoot = new ModelRenderer(this);
		armorLeftBoot.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedLeftLeg.addChild(armorLeftBoot);
	}
}