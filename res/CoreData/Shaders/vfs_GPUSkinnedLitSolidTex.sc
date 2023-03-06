�GSN    �˅1��\7,5V'pcw2toT��6�6e�$<غ�$^h����t�&�N��b�p<�N%�5py|pj���Rv��!B1��!�u�'aQ����ؕpՀ��$HH�zL�hC��J���\D��Y:@2��,#�#�G{���"�,S��dP������`����xO���8��DJ+I�$�暴U" ��3I�OF������q%��j����HT+������ՄV�#p6y������Eo����o�~O }f�ޜ�Х)n��j��-R�Yrc�z��ݻ�w'ɩY� ���l&���:v�L�^�QQ��NE`�d� v)*�de�I�=����j.�>����e�!�a��"(x���c�����'�=*�d��ؓv��̶}O_���,n�{Q��L�ߊ+��Jšp�'�o���[R2MΓ��.�{��t���>/]��i�J)��tZ����|���F����p��B5O����=!~�&�0�u�m}QI+ە���6~cro/NormalFinal.glsl"
     #include "Library/Macro/Texcoord0Final.glsl"
     #include "Library/Macro/ShadowCoordFinal.glsl"
�
}
#endif

#ifdef FS

/// input
#define USING_INOUT_NORMAL
#define USING_INOUT_TEXCOORD0
#define USING_INOUT_SHADOWCOOR
#define USING_INOUT_FRAGPOS
#include "Library/Varying.glsl"

/// Common (uniforms,samplers, transforms ... )
#define RECE�VED_SHADOW
#include "Library/Common.glsl"
#include "Library/Lighting.glsl"

void main()
{
    vec4 texColor = texture2D(u%diffuseTex,v_texcoord0);
    vec3 environmentColor = GetEnvironmentColor(v_normal);
    vec3 lightColor = GetLightColor(v_noral);

    gl_FragColor = vec4((environmentColor + lightColor) * texColor.rgb,1.0);
}

#endif
