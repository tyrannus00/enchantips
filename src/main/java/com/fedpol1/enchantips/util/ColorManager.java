package com.fedpol1.enchantips.util;

import net.minecraft.text.TextColor;

public abstract class ColorManager {

    public static TextColor lerpColor(TextColor min, TextColor max, float intensity) {
        int rgbMin = min.getRgb();
        int rgbMax = max.getRgb();

        int r1 = (rgbMin & 0xff0000) >> 16;
        int r2 = (rgbMax & 0xff0000) >> 16;
        int g1 = (rgbMin & 0xff00) >> 8;
        int g2 = (rgbMax & 0xff00) >> 8;
        int b1 = (rgbMin & 0xff);
        int b2 = (rgbMax & 0xff);

        r1 += (r2-r1) * intensity;
        g1 += (g2-g1) * intensity;
        b1 += (b2-b1) * intensity;

        return TextColor.fromRgb((r1<<16) + (g1<<8) + b1);
    }
}
