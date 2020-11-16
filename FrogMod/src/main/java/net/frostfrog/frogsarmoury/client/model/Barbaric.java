package net.frostfrog.frogsarmoury.client.model;

import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.ResourceLocation;

public class Barbaric extends ArmorBaseModel
{
    public Barbaric()
    {
        super(128, 128, new ResourceLocation("frogsarmoury", "textures/models/armor/barbaric.png"));
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
        final ModelRenderer cube_r7;
        final ModelRenderer cube_r8;
        final ModelRenderer cube_r9;
        final ModelRenderer cube_r10;
        final ModelRenderer cube_r11;
        final ModelRenderer cube_r12;
        final ModelRenderer cube_r13;

        textureWidth = 128;
        textureHeight = 128;

        armorHead = new ModelRenderer(this);
        armorHead.setRotationPoint(0.0F, 0.0F, 0.0F);
        bipedHead.addChild(armorHead);
        armorHead.setTextureOffset(0, 0).addBox(-5.0F, -8.0F, -5.0F, 10.0F, 2.0F, 10.0F, 0.0F, false);
        armorHead.setTextureOffset(24, 24).addBox(-4.0F, -9.0F, -4.0F, 8.0F, 1.0F, 8.0F, 0.0F, false);
        armorHead.setTextureOffset(47, 47).addBox(4.0F, -6.0F, -4.0F, 1.0F, 2.0F, 9.0F, 0.0F, false);
        armorHead.setTextureOffset(40, 0).addBox(-5.0F, -6.0F, -4.0F, 1.0F, 2.0F, 9.0F, 0.0F, false);
        armorHead.setTextureOffset(48, 22).addBox(4.0F, -4.0F, -3.0F, 1.0F, 2.0F, 8.0F, 0.0F, false);
        armorHead.setTextureOffset(48, 12).addBox(-5.0F, -4.0F, -3.0F, 1.0F, 2.0F, 8.0F, 0.0F, false);
        armorHead.setTextureOffset(62, 29).addBox(4.0F, -2.0F, -1.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
        armorHead.setTextureOffset(8, 61).addBox(-5.0F, -2.0F, -1.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
        armorHead.setTextureOffset(56, 58).addBox(-4.0F, -6.0F, 4.0F, 8.0F, 4.0F, 1.0F, 0.0F, false);
        armorHead.setTextureOffset(52, 35).addBox(2.0F, -2.0F, 4.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
        armorHead.setTextureOffset(52, 33).addBox(-4.0F, -2.0F, 4.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
        armorHead.setTextureOffset(51, 7).addBox(-1.5F, -6.0F, -5.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
        armorHead.setTextureOffset(42, 4).addBox(-1.0F, -2.0F, -5.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
        armorHead.setTextureOffset(0, 0).addBox(-0.5F, -5.0F, -5.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
        armorHead.setTextureOffset(24, 12).addBox(-6.0F, -7.0F, -1.0F, 12.0F, 4.0F, 4.0F, 0.0F, false);
        armorHead.setTextureOffset(12, 44).addBox(-1.0F, -9.5F, -3.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
        armorHead.setTextureOffset(30, 7).addBox(-1.0F, -9.5F, -0.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
        armorHead.setTextureOffset(36, 33).addBox(-1.0F, -9.5F, 2.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
        armorHead.setTextureOffset(0, 16).addBox(-1.0F, -7.5F, 3.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
        armorHead.setTextureOffset(0, 12).addBox(-1.0F, -4.5F, 3.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);

        cube_r1 = new ModelRenderer(this);
        cube_r1.setRotationPoint(0.5F, -4.0F, 5.25F);
        armorHead.addChild(cube_r1);
        setRotationAngle(cube_r1, -1.9635F, 0.0F, 0.0F);
        cube_r1.setTextureOffset(6, 0).addBox(-1.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r2 = new ModelRenderer(this);
        cube_r2.setRotationPoint(0.5F, -7.0F, 5.25F);
        armorHead.addChild(cube_r2);
        setRotationAngle(cube_r2, -1.9635F, 0.0F, 0.0F);
        cube_r2.setTextureOffset(24, 12).addBox(-1.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r3 = new ModelRenderer(this);
        cube_r3.setRotationPoint(0.5F, -9.0F, 2.75F);
        armorHead.addChild(cube_r3);
        setRotationAngle(cube_r3, -0.3927F, 0.0F, 0.0F);
        cube_r3.setTextureOffset(0, 28).addBox(-1.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r4 = new ModelRenderer(this);
        cube_r4.setRotationPoint(0.5F, -9.0F, -3.25F);
        armorHead.addChild(cube_r4);
        setRotationAngle(cube_r4, -0.3927F, 0.0F, 0.0F);
        cube_r4.setTextureOffset(24, 33).addBox(-1.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r5 = new ModelRenderer(this);
        cube_r5.setRotationPoint(0.5F, -9.0F, -0.25F);
        armorHead.addChild(cube_r5);
        setRotationAngle(cube_r5, -0.3927F, 0.0F, 0.0F);
        cube_r5.setTextureOffset(40, 40).addBox(-1.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r6 = new ModelRenderer(this);
        cube_r6.setRotationPoint(12.0F, -0.75F, -2.5F);
        armorHead.addChild(cube_r6);
        setRotationAngle(cube_r6, -2.6616F, -0.1745F, 0.0F);
        cube_r6.setTextureOffset(66, 20).addBox(-1.0F, -1.0F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);

        cube_r7 = new ModelRenderer(this);
        cube_r7.setRotationPoint(-10.1213F, -2.5F, -0.2071F);
        armorHead.addChild(cube_r7);
        setRotationAngle(cube_r7, 0.0F, -0.4363F, -0.829F);
        cube_r7.setTextureOffset(32, 20).addBox(-2.0F, -1.0F, -1.0F, 6.0F, 2.0F, 2.0F, 0.0F, false);

        cube_r8 = new ModelRenderer(this);
        cube_r8.setRotationPoint(10.1213F, -2.5F, -0.2071F);
        armorHead.addChild(cube_r8);
        setRotationAngle(cube_r8, 0.0F, 0.4363F, 0.829F);
        cube_r8.setTextureOffset(58, 52).addBox(-4.0F, -1.0F, -1.0F, 6.0F, 2.0F, 2.0F, 0.0F, false);

        cube_r9 = new ModelRenderer(this);
        cube_r9.setRotationPoint(-7.0F, -3.5F, -0.5F);
        armorHead.addChild(cube_r9);
        setRotationAngle(cube_r9, 0.0F, 0.0F, -0.2182F);
        cube_r9.setTextureOffset(58, 14).addBox(-2.0F, -3.0F, 0.0F, 4.0F, 3.0F, 3.0F, 0.0F, false);

        cube_r10 = new ModelRenderer(this);
        cube_r10.setRotationPoint(7.0F, -3.5F, -0.5F);
        armorHead.addChild(cube_r10);
        setRotationAngle(cube_r10, 0.0F, 0.0F, 0.2182F);
        cube_r10.setTextureOffset(29, 63).addBox(-2.0F, -3.0F, 0.0F, 4.0F, 3.0F, 3.0F, 0.0F, false);

        cube_r11 = new ModelRenderer(this);
        cube_r11.setRotationPoint(-12.0F, -0.75F, -2.5F);
        armorHead.addChild(cube_r11);
        setRotationAngle(cube_r11, -2.6616F, 0.1745F, 0.0F);
        cube_r11.setTextureOffset(64, 66).addBox(0.0F, -1.0F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);

        armorBody = new ModelRenderer(this);
        armorBody.setRotationPoint(0.0F, 0.0F, 0.0F);
        bipedBody.addChild(armorBody);
        armorBody.setTextureOffset(20, 28).addBox(-2.0F, 3.0F, -3.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);
        armorBody.setTextureOffset(36, 7).addBox(-1.5F, 6.0F, -3.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);

        armorRightArm = new ModelRenderer(this);
        armorRightArm.setRotationPoint(-4.0F, 2.0F, 0.0F);
        bipedRightArm.addChild(armorRightArm);
        armorRightArm.setTextureOffset(58, 43).addBox(-5.0F, -2.0F, -3.0F, 2.0F, 3.0F, 6.0F, 0.0F, false);
        armorRightArm.setTextureOffset(58, 7).addBox(-4.0F, -3.0F, -3.0F, 3.0F, 1.0F, 6.0F, 0.0F, false);
        armorRightArm.setTextureOffset(0, 60).addBox(-3.0F, -2.0F, -3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
        armorRightArm.setTextureOffset(58, 63).addBox(-5.0F, 3.0F, -2.0F, 1.0F, 3.0F, 4.0F, 0.0F, false);
        armorRightArm.setTextureOffset(18, 65).addBox(-5.0F, 9.0F, -2.0F, 1.0F, 2.0F, 4.0F, 0.0F, false);
        armorRightArm.setTextureOffset(45, 66).addBox(-1.0F, 10.0F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
        armorRightArm.setTextureOffset(48, 22).addBox(-5.5F, 3.5F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
        armorRightArm.setTextureOffset(32, 52).addBox(-5.0F, 6.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
        armorRightArm.setTextureOffset(51, 3).addBox(-5.0F, 2.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
        armorRightArm.setTextureOffset(28, 49).addBox(-4.0F, 3.0F, -3.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
        armorRightArm.setTextureOffset(48, 26).addBox(-4.0F, 3.0F, 2.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
        armorRightArm.setTextureOffset(44, 58).addBox(-4.0F, 9.0F, -3.0F, 3.0F, 1.0F, 6.0F, 0.0F, false);
        armorRightArm.setTextureOffset(32, 56).addBox(-4.0F, 10.0F, -3.0F, 3.0F, 1.0F, 6.0F, 0.0F, false);
        armorRightArm.setTextureOffset(0, 15).addBox(-4.5F, 1.0F, -1.75F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        armorRightArm.setTextureOffset(18, 44).addBox(-2.75F, 4.0F, -2.5F, 3.0F, 1.0F, 0.0F, 0.0F, false);
        armorRightArm.setTextureOffset(44, 32).addBox(-4.5F, 6.0F, -1.75F, 0.0F, 3.0F, 1.0F, 0.0F, false);
        armorRightArm.setTextureOffset(2, 43).addBox(-4.5F, 6.0F, 0.75F, 0.0F, 3.0F, 1.0F, 0.0F, false);
        armorRightArm.setTextureOffset(6, 15).addBox(-4.5F, 1.0F, 0.75F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        armorRightArm.setTextureOffset(43, 7).addBox(-2.75F, 4.0F, 2.5F, 3.0F, 1.0F, 0.0F, 0.0F, false);
        armorRightArm.setTextureOffset(0, 3).addBox(0.25F, 4.0F, -2.5F, 0.0F, 1.0F, 5.0F, 0.0F, false);

        cube_r12 = new ModelRenderer(this);
        cube_r12.setRotationPoint(-6.0F, 4.5F, 0.0F);
        armorRightArm.addChild(cube_r12);
        setRotationAngle(cube_r12, 0.0F, 0.0F, 0.3491F);
        cube_r12.setTextureOffset(40, 37).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);

        armorLeftArm = new ModelRenderer(this);
        armorLeftArm.setRotationPoint(4.0F, 2.0F, 0.0F);
        bipedLeftArm.addChild(armorLeftArm);
        armorLeftArm.setTextureOffset(52, 34).addBox(3.0F, -2.0F, -3.0F, 2.0F, 3.0F, 6.0F, 0.0F, false);
        armorLeftArm.setTextureOffset(51, 0).addBox(1.0F, -3.0F, -3.0F, 3.0F, 1.0F, 6.0F, 0.0F, false);
        armorLeftArm.setTextureOffset(58, 22).addBox(2.0F, -2.0F, -3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
        armorLeftArm.setTextureOffset(0, 0).addBox(4.0F, 3.0F, -2.0F, 1.0F, 3.0F, 4.0F, 0.0F, false);
        armorLeftArm.setTextureOffset(63, 0).addBox(4.0F, 9.0F, -2.0F, 1.0F, 2.0F, 4.0F, 0.0F, false);
        armorLeftArm.setTextureOffset(39, 65).addBox(0.0F, 10.0F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
        armorLeftArm.setTextureOffset(18, 45).addBox(4.5F, 3.5F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
        armorLeftArm.setTextureOffset(51, 0).addBox(4.0F, 6.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
        armorLeftArm.setTextureOffset(34, 49).addBox(4.0F, 2.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
        armorLeftArm.setTextureOffset(42, 0).addBox(2.0F, 3.0F, -3.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
        armorLeftArm.setTextureOffset(30, 0).addBox(2.0F, 3.0F, 2.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
        armorLeftArm.setTextureOffset(40, 33).addBox(1.0F, 9.0F, -3.0F, 3.0F, 1.0F, 6.0F, 0.0F, false);
        armorLeftArm.setTextureOffset(30, 0).addBox(1.0F, 10.0F, -3.0F, 3.0F, 1.0F, 6.0F, 0.0F, false);
        armorLeftArm.setTextureOffset(6, 11).addBox(4.5F, 1.0F, -1.75F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        armorLeftArm.setTextureOffset(40, 11).addBox(-0.25F, 4.0F, -2.5F, 3.0F, 1.0F, 0.0F, 0.0F, false);
        armorLeftArm.setTextureOffset(0, 43).addBox(4.5F, 6.0F, -1.75F, 0.0F, 3.0F, 1.0F, 0.0F, false);
        armorLeftArm.setTextureOffset(30, 27).addBox(4.5F, 6.0F, 0.75F, 0.0F, 3.0F, 1.0F, 0.0F, false);
        armorLeftArm.setTextureOffset(0, 11).addBox(4.5F, 1.0F, 0.75F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        armorLeftArm.setTextureOffset(0, 9).addBox(-0.25F, 4.0F, 2.5F, 3.0F, 1.0F, 0.0F, 0.0F, false);
        armorLeftArm.setTextureOffset(0, 2).addBox(-0.25F, 4.0F, -2.5F, 0.0F, 1.0F, 5.0F, 0.0F, false);

        cube_r13 = new ModelRenderer(this);
        cube_r13.setRotationPoint(3.3214F, 4.7619F, 0.0F);
        armorLeftArm.addChild(cube_r13);
        setRotationAngle(cube_r13, 0.0F, 0.0F, -0.3491F);
        cube_r13.setTextureOffset(30, 4).addBox(1.6066F, 0.17F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);

        armorRightLeg = new ModelRenderer(this);
        armorRightLeg.setRotationPoint(-2.0F, 12.0F, 0.0F);
        bipedRightLeg.addChild(armorRightLeg);

        armorRightBoot = new ModelRenderer(this);
        armorRightBoot.setRotationPoint(-2.0F, 12.0F, 0.0F);
        bipedRightLeg.addChild(armorRightBoot);

        armorLeftLeg = new ModelRenderer(this);
        armorLeftLeg.setRotationPoint(2.0F, 12.0F, 0.0F);
        bipedLeftLeg.addChild(armorLeftLeg);

        armorLeftBoot = new ModelRenderer(this);
        armorLeftBoot.setRotationPoint(2.0F, 12.0F, 0.0F);
        bipedLeftLeg.addChild(armorLeftBoot);
    }
}
