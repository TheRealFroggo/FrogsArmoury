package net.frostfrog.frogsarmoury.client.model;

import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.ResourceLocation;

public class Royal extends ArmorBaseModel
{
    public Royal()
    {
        super(128, 128, new ResourceLocation("frogsarmoury", "textures/models/armor/royal.png"));
    }

    @Override
    public void setupArmorParts()
    {
        final ModelRenderer cube_r1;
        final ModelRenderer cube_r2;
        final ModelRenderer cube_r3;
        final ModelRenderer cube_r4;
        final ModelRenderer cube_r5;
        final ModelRenderer cube_r6;

        armorHead = new ModelRenderer(this);
        armorHead.setRotationPoint(0.0F, 0.0F, 0.0F);
        bipedHead.addChild(armorHead);
        armorHead.setTextureOffset(26, 26).addBox(-4.5F, -1.25F, -4.5F, 9.0F, 1.0F, 8.0F, 0.0F, false);
        armorHead.setTextureOffset(55, 42).addBox(-4.5F, -8.25F, 3.5F, 9.0F, 8.0F, 1.0F, 0.0F, false);
        armorHead.setTextureOffset(32, 4).addBox(-4.5F, -4.25F, -4.5F, 4.0F, 3.0F, 8.0F, 0.0F, false);
        armorHead.setTextureOffset(18, 12).addBox(-4.5F, -5.25F, -4.5F, 1.0F, 0.0F, 9.0F, 0.0F, false);
        armorHead.setTextureOffset(30, 59).addBox(3.5F, -5.25F, -4.5F, 1.0F, 1.0F, 8.0F, 0.0F, false);
        armorHead.setTextureOffset(12, 59).addBox(-4.5F, -5.25F, -4.5F, 1.0F, 1.0F, 8.0F, 0.0F, false);
        armorHead.setTextureOffset(0, 46).addBox(0.5F, -6.25F, -4.5F, 4.0F, 1.0F, 8.0F, 0.0F, false);
        armorHead.setTextureOffset(0, 23).addBox(-4.5F, -8.25F, -4.5F, 9.0F, 2.0F, 8.0F, 0.0F, false);
        armorHead.setTextureOffset(39, 43).addBox(-4.5F, -6.25F, -4.5F, 4.0F, 1.0F, 8.0F, 0.0F, false);
        armorHead.setTextureOffset(28, 15).addBox(0.5F, -4.25F, -4.5F, 4.0F, 3.0F, 8.0F, 0.0F, false);
        armorHead.setTextureOffset(68, 23).addBox(-3.5F, -6.25F, -4.25F, 7.0F, 5.0F, 0.0F, 0.0F, false);

        cube_r1 = new ModelRenderer(this);
        cube_r1.setRotationPoint(5.3551F, -5.0F, 2.3492F);
        armorHead.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.0F, 0.3491F, 0.0F);
        cube_r1.setTextureOffset(0, 0).addBox(-0.1051F, -2.0F, -2.5F, 0.0F, 4.0F, 5.0F, 0.0F, false);

        cube_r2 = new ModelRenderer(this);
        cube_r2.setRotationPoint(-5.2344F, -5.0F, 1.6652F);
        armorHead.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.0F, -0.3491F, 0.0F);
        cube_r2.setTextureOffset(22, 30).addBox(-0.0156F, -2.0F, -2.5F, 0.0F, 4.0F, 5.0F, 0.0F, false);

        armorBody = new ModelRenderer(this);
        armorBody.setRotationPoint(0.0F, 0.0F, 0.0F);
        bipedBody.addChild(armorBody);
        armorBody.setTextureOffset(0, 33).addBox(-4.0F, 1.0F, -3.0F, 8.0F, 7.0F, 6.0F, 0.0F, false);
        armorBody.setTextureOffset(73, 60).addBox(-5.0F, 1.0F, -2.0F, 1.0F, 7.0F, 4.0F, 0.0F, false);
        armorBody.setTextureOffset(72, 72).addBox(4.0F, 1.0F, -2.0F, 1.0F, 7.0F, 4.0F, 0.0F, false);
        armorBody.setTextureOffset(74, 55).addBox(-3.0F, 8.0F, -2.5F, 6.0F, 4.0F, 1.0F, 0.0F, false);
        armorBody.setTextureOffset(0, 0).addBox(-2.0F, 8.0F, 2.0F, 4.0F, 4.0F, 1.0F, 0.0F, false);
        armorBody.setTextureOffset(71, 0).addBox(-4.25F, 8.0F, -2.25F, 2.0F, 4.0F, 5.0F, 0.0F, false);
        armorBody.setTextureOffset(70, 46).addBox(2.25F, 8.0F, -2.25F, 2.0F, 4.0F, 5.0F, 0.0F, false);

        cube_r3 = new ModelRenderer(this);
        cube_r3.setRotationPoint(0.0F, 7.3536F, -0.372F);
        armorBody.addChild(cube_r3);
        setRotationAngle(cube_r3, 0.1745F, 0.0F, 0.0F);
        cube_r3.setTextureOffset(0, 12).addBox(-4.5F, -7.7277F, -3.0054F, 9.0F, 2.0F, 9.0F, 0.0F, false);
        cube_r3.setTextureOffset(0, 0).addBox(-5.0F, -8.7993F, -3.3242F, 10.0F, 2.0F, 10.0F, 0.0F, false);

        armorRightArm = new ModelRenderer(this);
        armorRightArm.setRotationPoint(-4.0F, 2.0F, 0.0F);
        bipedRightArm.addChild(armorRightArm);
        armorRightArm.setTextureOffset(38, 69).addBox(-4.5F, 2.5F, -2.5F, 2.0F, 5.0F, 5.0F, 0.0F, false);
        armorRightArm.setTextureOffset(75, 38).addBox(-5.0F, 3.0F, -2.0F, 2.0F, 4.0F, 4.0F, 0.0F, false);
        armorRightArm.setTextureOffset(22, 59).addBox(-2.5F, 4.5F, -2.5F, 3.0F, 1.0F, 5.0F, 0.0F, false);
        armorRightArm.setTextureOffset(66, 15).addBox(-4.75F, -1.5F, -2.5F, 4.0F, 3.0F, 5.0F, 0.0F, false);

        cube_r4 = new ModelRenderer(this);
        cube_r4.setRotationPoint(-3.2212F, 1.1635F, 0.0F);
        armorRightArm.addChild(cube_r4);
        setRotationAngle(cube_r4, 0.0F, 0.0F, -0.6109F);
        cube_r4.setTextureOffset(77, 78).addBox(-0.3666F, -3.3152F, -2.5F, 1.0F, 1.0F, 5.0F, 0.0F, false);
        cube_r4.setTextureOffset(78, 66).addBox(1.6334F, -3.8152F, -2.5F, 1.0F, 1.0F, 5.0F, 0.0F, false);
        cube_r4.setTextureOffset(21, 43).addBox(-2.0552F, -1.717F, -3.5F, 6.0F, 1.0F, 7.0F, 0.0F, false);
        cube_r4.setTextureOffset(40, 52).addBox(-1.1166F, -3.0652F, -3.0F, 5.0F, 2.0F, 6.0F, 0.0F, false);

        armorLeftArm = new ModelRenderer(this);
        armorLeftArm.setRotationPoint(4.0F, 2.0F, 0.0F);
        bipedLeftArm.addChild(armorLeftArm);
        armorLeftArm.setTextureOffset(24, 68).addBox(2.5F, 2.5F, -2.5F, 2.0F, 5.0F, 5.0F, 0.0F, false);
        armorLeftArm.setTextureOffset(52, 74).addBox(3.0F, 3.0F, -2.0F, 2.0F, 4.0F, 4.0F, 0.0F, false);
        armorLeftArm.setTextureOffset(58, 51).addBox(-0.5F, 4.5F, -2.5F, 3.0F, 1.0F, 5.0F, 0.0F, false);
        armorLeftArm.setTextureOffset(63, 30).addBox(0.75F, -1.5F, -2.5F, 4.0F, 3.0F, 5.0F, 0.0F, false);

        cube_r5 = new ModelRenderer(this);
        cube_r5.setRotationPoint(3.2212F, 1.1635F, 0.0F);
        armorLeftArm.addChild(cube_r5);
        setRotationAngle(cube_r5, 0.0F, 0.0F, 0.6109F);
        cube_r5.setTextureOffset(76, 9).addBox(-0.6334F, -3.3152F, -2.5F, 1.0F, 1.0F, 5.0F, 0.0F, false);
        cube_r5.setTextureOffset(76, 28).addBox(-2.6334F, -3.8152F, -2.5F, 1.0F, 1.0F, 5.0F, 0.0F, false);
        cube_r5.setTextureOffset(28, 35).addBox(-3.9448F, -1.717F, -3.5F, 6.0F, 1.0F, 7.0F, 0.0F, false);
        cube_r5.setTextureOffset(18, 51).addBox(-3.8834F, -3.0652F, -3.0F, 5.0F, 2.0F, 6.0F, 0.0F, false);

        armorRightLeg = new ModelRenderer(this);
        armorRightLeg.setRotationPoint(-2.0F, 12.0F, 0.0F);
        bipedRightLeg.addChild(armorRightLeg);
        armorRightLeg.setTextureOffset(0, 62).addBox(-2.25F, 0.0F, -2.25F, 1.0F, 9.0F, 5.0F, 0.0F, false);
        armorRightLeg.setTextureOffset(48, 60).addBox(1.25F, 0.0F, -2.25F, 1.0F, 9.0F, 5.0F, 0.0F, false);
        armorRightLeg.setTextureOffset(0, 12).addBox(-1.5F, 3.75F, -2.5F, 3.0F, 2.0F, 1.0F, 0.0F, false);
        armorRightLeg.setTextureOffset(0, 18).addBox(-1.5F, 4.25F, 1.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
        armorRightLeg.setTextureOffset(0, 76).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 9.0F, 1.0F, 0.0F, false);
        armorRightLeg.setTextureOffset(30, 0).addBox(-1.5F, 0.0F, 1.25F, 3.0F, 9.0F, 1.0F, 0.0F, false);
        armorRightLeg.setTextureOffset(52, 23).addBox(-2.5F, -0.5F, -3.0F, 5.0F, 1.0F, 6.0F, 0.0F, false);

        armorRightBoot = new ModelRenderer(this);
        armorRightBoot.setRotationPoint(-2.0F, 12.0F, 0.0F);
        bipedRightLeg.addChild(armorRightBoot);
        armorRightBoot.setTextureOffset(44, 15).addBox(-2.5F, 10.5F, -3.5F, 5.0F, 2.0F, 6.0F, 0.0F, false);
        armorRightBoot.setTextureOffset(56, 8).addBox(-2.5F, 8.5F, -2.5F, 5.0F, 2.0F, 5.0F, 0.0F, false);
        armorRightBoot.setTextureOffset(0, 55).addBox(-2.5F, 8.5F, -2.5F, 5.0F, 2.0F, 5.0F, 0.0F, false);

        armorLeftLeg = new ModelRenderer(this);
        armorLeftLeg.setRotationPoint(2.0F, 12.0F, 0.0F);
        bipedLeftLeg.addChild(armorLeftLeg);
        armorLeftLeg.setTextureOffset(12, 68).addBox(-2.25F, 0.0F, -2.25F, 1.0F, 9.0F, 5.0F, 0.0F, false);
        armorLeftLeg.setTextureOffset(60, 64).addBox(1.25F, 0.0F, -2.25F, 1.0F, 9.0F, 5.0F, 0.0F, false);
        armorLeftLeg.setTextureOffset(0, 15).addBox(-1.5F, 3.75F, -2.5F, 3.0F, 2.0F, 1.0F, 0.0F, false);
        armorLeftLeg.setTextureOffset(0, 23).addBox(-1.5F, 4.25F, 1.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
        armorLeftLeg.setTextureOffset(24, 78).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 9.0F, 1.0F, 0.0F, false);
        armorLeftLeg.setTextureOffset(64, 78).addBox(-1.5F, 0.0F, 1.25F, 3.0F, 9.0F, 1.0F, 0.0F, false);
        armorLeftLeg.setTextureOffset(47, 35).addBox(-2.5F, -0.5F, -3.0F, 5.0F, 1.0F, 6.0F, 0.0F, false);

        armorLeftBoot = new ModelRenderer(this);
        armorLeftBoot.setRotationPoint(2.0F, 12.0F, 0.0F);
        bipedLeftLeg.addChild(armorLeftBoot);
        armorLeftBoot.setTextureOffset(48, 0).addBox(-2.5F, 10.5F, -3.5F, 5.0F, 2.0F, 6.0F, 0.0F, false);
        armorLeftBoot.setTextureOffset(57, 57).addBox(-2.5F, 8.5F, -2.5F, 5.0F, 2.0F, 5.0F, 0.0F, false);
    }
}
