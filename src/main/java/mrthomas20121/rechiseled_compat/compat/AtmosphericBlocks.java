package mrthomas20121.rechiseled_compat.compat;

import mrthomas20121.rechiseled_compat.RechiseledCompat;
import mrthomas20121.rechiseled_compat.block.ChiseledBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
public class AtmosphericBlocks {

    public static DeferredRegister<Block> BLOCKS = DeferredRegister.create(Block.class, RechiseledCompat.MOD_ID);

    public static RegistryObject<Block>  ATMOSPHERIC_ARID_SANDSTONE_BRICKS = BLOCKS.register("atmospheric_arid_sandstone_bricks", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_ARID_SANDSTONE_BRICKS_CONNECTING = BLOCKS.register("atmospheric_arid_sandstone_bricks_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_ARID_SANDSTONE_LARGE_TILES = BLOCKS.register("atmospheric_arid_sandstone_large_tiles", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_ARID_SANDSTONE_LARGE_TILES_CONNECTING = BLOCKS.register("atmospheric_arid_sandstone_large_tiles_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_ARID_SANDSTONE_POLISHED = BLOCKS.register("atmospheric_arid_sandstone_polished", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_ARID_SANDSTONE_POLISHED_CONNECTING = BLOCKS.register("atmospheric_arid_sandstone_polished_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_ARID_SANDSTONE_TILES = BLOCKS.register("atmospheric_arid_sandstone_tiles", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_ARID_SANDSTONE_TILES_CONNECTING = BLOCKS.register("atmospheric_arid_sandstone_tiles_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_ASPEN_PLANKS_BEAMS = BLOCKS.register("atmospheric_aspen_planks_beams", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_ASPEN_PLANKS_BEAMS_CONNECTING = BLOCKS.register("atmospheric_aspen_planks_beams_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_ASPEN_PLANKS_BRICKS = BLOCKS.register("atmospheric_aspen_planks_bricks", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_ASPEN_PLANKS_BRICKS_CONNECTING = BLOCKS.register("atmospheric_aspen_planks_bricks_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_ASPEN_PLANKS_CRATE = BLOCKS.register("atmospheric_aspen_planks_crate", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_ASPEN_PLANKS_CRATE_CONNECTING = BLOCKS.register("atmospheric_aspen_planks_crate_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_ASPEN_PLANKS_DIAGONAL_STRIPES = BLOCKS.register("atmospheric_aspen_planks_diagonal_stripes", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_ASPEN_PLANKS_DIAGONAL_STRIPES_CONNECTING = BLOCKS.register("atmospheric_aspen_planks_diagonal_stripes_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_ASPEN_PLANKS_DIAGONAL_TILES = BLOCKS.register("atmospheric_aspen_planks_diagonal_tiles", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_ASPEN_PLANKS_DIAGONAL_TILES_CONNECTING = BLOCKS.register("atmospheric_aspen_planks_diagonal_tiles_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_ASPEN_PLANKS_DOTTED = BLOCKS.register("atmospheric_aspen_planks_dotted", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_ASPEN_PLANKS_DOTTED_CONNECTING = BLOCKS.register("atmospheric_aspen_planks_dotted_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_ASPEN_PLANKS_FLOORING = BLOCKS.register("atmospheric_aspen_planks_flooring", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_ASPEN_PLANKS_FLOORING_CONNECTING = BLOCKS.register("atmospheric_aspen_planks_flooring_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_ASPEN_PLANKS_LARGE_TILES = BLOCKS.register("atmospheric_aspen_planks_large_tiles", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_ASPEN_PLANKS_LARGE_TILES_CONNECTING = BLOCKS.register("atmospheric_aspen_planks_large_tiles_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_ASPEN_PLANKS_PATTERN = BLOCKS.register("atmospheric_aspen_planks_pattern", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_ASPEN_PLANKS_PATTERN_CONNECTING = BLOCKS.register("atmospheric_aspen_planks_pattern_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_ASPEN_PLANKS_SMALL_BRICKS = BLOCKS.register("atmospheric_aspen_planks_small_bricks", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_ASPEN_PLANKS_SMALL_BRICKS_CONNECTING = BLOCKS.register("atmospheric_aspen_planks_small_bricks_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_ASPEN_PLANKS_SMALL_TILES = BLOCKS.register("atmospheric_aspen_planks_small_tiles", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_ASPEN_PLANKS_SMALL_TILES_CONNECTING = BLOCKS.register("atmospheric_aspen_planks_small_tiles_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_ASPEN_PLANKS_SQUARES = BLOCKS.register("atmospheric_aspen_planks_squares", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_ASPEN_PLANKS_SQUARES_CONNECTING = BLOCKS.register("atmospheric_aspen_planks_squares_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_ASPEN_PLANKS_TILES = BLOCKS.register("atmospheric_aspen_planks_tiles", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_ASPEN_PLANKS_TILES_CONNECTING = BLOCKS.register("atmospheric_aspen_planks_tiles_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_ASPEN_PLANKS_WAVY = BLOCKS.register("atmospheric_aspen_planks_wavy", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_ASPEN_PLANKS_WAVY_CONNECTING = BLOCKS.register("atmospheric_aspen_planks_wavy_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_ASPEN_PLANKS_WOVEN = BLOCKS.register("atmospheric_aspen_planks_woven", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_ASPEN_PLANKS_WOVEN_CONNECTING = BLOCKS.register("atmospheric_aspen_planks_woven_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_GRIMWOOD_PLANKS_BEAMS = BLOCKS.register("atmospheric_grimwood_planks_beams", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_GRIMWOOD_PLANKS_BEAMS_CONNECTING = BLOCKS.register("atmospheric_grimwood_planks_beams_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_GRIMWOOD_PLANKS_BRICKS = BLOCKS.register("atmospheric_grimwood_planks_bricks", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_GRIMWOOD_PLANKS_BRICKS_CONNECTING = BLOCKS.register("atmospheric_grimwood_planks_bricks_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_GRIMWOOD_PLANKS_CRATE = BLOCKS.register("atmospheric_grimwood_planks_crate", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_GRIMWOOD_PLANKS_CRATE_CONNECTING = BLOCKS.register("atmospheric_grimwood_planks_crate_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_GRIMWOOD_PLANKS_DIAGONAL_STRIPES = BLOCKS.register("atmospheric_grimwood_planks_diagonal_stripes", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_GRIMWOOD_PLANKS_DIAGONAL_STRIPES_CONNECTING = BLOCKS.register("atmospheric_grimwood_planks_diagonal_stripes_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_GRIMWOOD_PLANKS_DIAGONAL_TILES = BLOCKS.register("atmospheric_grimwood_planks_diagonal_tiles", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_GRIMWOOD_PLANKS_DIAGONAL_TILES_CONNECTING = BLOCKS.register("atmospheric_grimwood_planks_diagonal_tiles_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_GRIMWOOD_PLANKS_DOTTED = BLOCKS.register("atmospheric_grimwood_planks_dotted", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_GRIMWOOD_PLANKS_DOTTED_CONNECTING = BLOCKS.register("atmospheric_grimwood_planks_dotted_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_GRIMWOOD_PLANKS_FLOORING = BLOCKS.register("atmospheric_grimwood_planks_flooring", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_GRIMWOOD_PLANKS_FLOORING_CONNECTING = BLOCKS.register("atmospheric_grimwood_planks_flooring_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_GRIMWOOD_PLANKS_LARGE_TILES = BLOCKS.register("atmospheric_grimwood_planks_large_tiles", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_GRIMWOOD_PLANKS_LARGE_TILES_CONNECTING = BLOCKS.register("atmospheric_grimwood_planks_large_tiles_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_GRIMWOOD_PLANKS_PATTERN = BLOCKS.register("atmospheric_grimwood_planks_pattern", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_GRIMWOOD_PLANKS_PATTERN_CONNECTING = BLOCKS.register("atmospheric_grimwood_planks_pattern_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_GRIMWOOD_PLANKS_SMALL_BRICKS = BLOCKS.register("atmospheric_grimwood_planks_small_bricks", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_GRIMWOOD_PLANKS_SMALL_BRICKS_CONNECTING = BLOCKS.register("atmospheric_grimwood_planks_small_bricks_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_GRIMWOOD_PLANKS_SMALL_TILES = BLOCKS.register("atmospheric_grimwood_planks_small_tiles", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_GRIMWOOD_PLANKS_SMALL_TILES_CONNECTING = BLOCKS.register("atmospheric_grimwood_planks_small_tiles_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_GRIMWOOD_PLANKS_SQUARES = BLOCKS.register("atmospheric_grimwood_planks_squares", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_GRIMWOOD_PLANKS_SQUARES_CONNECTING = BLOCKS.register("atmospheric_grimwood_planks_squares_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_GRIMWOOD_PLANKS_TILES = BLOCKS.register("atmospheric_grimwood_planks_tiles", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_GRIMWOOD_PLANKS_TILES_CONNECTING = BLOCKS.register("atmospheric_grimwood_planks_tiles_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_GRIMWOOD_PLANKS_WAVY = BLOCKS.register("atmospheric_grimwood_planks_wavy", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_GRIMWOOD_PLANKS_WAVY_CONNECTING = BLOCKS.register("atmospheric_grimwood_planks_wavy_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_GRIMWOOD_PLANKS_WOVEN = BLOCKS.register("atmospheric_grimwood_planks_woven", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_GRIMWOOD_PLANKS_WOVEN_CONNECTING = BLOCKS.register("atmospheric_grimwood_planks_woven_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_KOUSA_PLANKS_BEAMS = BLOCKS.register("atmospheric_kousa_planks_beams", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_KOUSA_PLANKS_BEAMS_CONNECTING = BLOCKS.register("atmospheric_kousa_planks_beams_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_KOUSA_PLANKS_BRICKS = BLOCKS.register("atmospheric_kousa_planks_bricks", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_KOUSA_PLANKS_BRICKS_CONNECTING = BLOCKS.register("atmospheric_kousa_planks_bricks_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_KOUSA_PLANKS_CRATE = BLOCKS.register("atmospheric_kousa_planks_crate", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_KOUSA_PLANKS_CRATE_CONNECTING = BLOCKS.register("atmospheric_kousa_planks_crate_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_KOUSA_PLANKS_DIAGONAL_STRIPES = BLOCKS.register("atmospheric_kousa_planks_diagonal_stripes", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_KOUSA_PLANKS_DIAGONAL_STRIPES_CONNECTING = BLOCKS.register("atmospheric_kousa_planks_diagonal_stripes_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_KOUSA_PLANKS_DIAGONAL_TILES = BLOCKS.register("atmospheric_kousa_planks_diagonal_tiles", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_KOUSA_PLANKS_DIAGONAL_TILES_CONNECTING = BLOCKS.register("atmospheric_kousa_planks_diagonal_tiles_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_KOUSA_PLANKS_DOTTED = BLOCKS.register("atmospheric_kousa_planks_dotted", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_KOUSA_PLANKS_DOTTED_CONNECTING = BLOCKS.register("atmospheric_kousa_planks_dotted_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_KOUSA_PLANKS_FLOORING = BLOCKS.register("atmospheric_kousa_planks_flooring", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_KOUSA_PLANKS_FLOORING_CONNECTING = BLOCKS.register("atmospheric_kousa_planks_flooring_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_KOUSA_PLANKS_LARGE_TILES = BLOCKS.register("atmospheric_kousa_planks_large_tiles", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_KOUSA_PLANKS_LARGE_TILES_CONNECTING = BLOCKS.register("atmospheric_kousa_planks_large_tiles_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_KOUSA_PLANKS_PATTERN = BLOCKS.register("atmospheric_kousa_planks_pattern", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_KOUSA_PLANKS_PATTERN_CONNECTING = BLOCKS.register("atmospheric_kousa_planks_pattern_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_KOUSA_PLANKS_SMALL_BRICKS = BLOCKS.register("atmospheric_kousa_planks_small_bricks", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_KOUSA_PLANKS_SMALL_BRICKS_CONNECTING = BLOCKS.register("atmospheric_kousa_planks_small_bricks_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_KOUSA_PLANKS_SMALL_TILES = BLOCKS.register("atmospheric_kousa_planks_small_tiles", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_KOUSA_PLANKS_SMALL_TILES_CONNECTING = BLOCKS.register("atmospheric_kousa_planks_small_tiles_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_KOUSA_PLANKS_SQUARES = BLOCKS.register("atmospheric_kousa_planks_squares", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_KOUSA_PLANKS_SQUARES_CONNECTING = BLOCKS.register("atmospheric_kousa_planks_squares_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_KOUSA_PLANKS_TILES = BLOCKS.register("atmospheric_kousa_planks_tiles", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_KOUSA_PLANKS_TILES_CONNECTING = BLOCKS.register("atmospheric_kousa_planks_tiles_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_KOUSA_PLANKS_WAVY = BLOCKS.register("atmospheric_kousa_planks_wavy", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_KOUSA_PLANKS_WAVY_CONNECTING = BLOCKS.register("atmospheric_kousa_planks_wavy_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_KOUSA_PLANKS_WOVEN = BLOCKS.register("atmospheric_kousa_planks_woven", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_KOUSA_PLANKS_WOVEN_CONNECTING = BLOCKS.register("atmospheric_kousa_planks_woven_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_MORADO_PLANKS_BEAMS = BLOCKS.register("atmospheric_morado_planks_beams", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_MORADO_PLANKS_BEAMS_CONNECTING = BLOCKS.register("atmospheric_morado_planks_beams_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_MORADO_PLANKS_BRICKS = BLOCKS.register("atmospheric_morado_planks_bricks", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_MORADO_PLANKS_BRICKS_CONNECTING = BLOCKS.register("atmospheric_morado_planks_bricks_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_MORADO_PLANKS_CRATE = BLOCKS.register("atmospheric_morado_planks_crate", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_MORADO_PLANKS_CRATE_CONNECTING = BLOCKS.register("atmospheric_morado_planks_crate_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_MORADO_PLANKS_DIAGONAL_STRIPES = BLOCKS.register("atmospheric_morado_planks_diagonal_stripes", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_MORADO_PLANKS_DIAGONAL_STRIPES_CONNECTING = BLOCKS.register("atmospheric_morado_planks_diagonal_stripes_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_MORADO_PLANKS_DIAGONAL_TILES = BLOCKS.register("atmospheric_morado_planks_diagonal_tiles", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_MORADO_PLANKS_DIAGONAL_TILES_CONNECTING = BLOCKS.register("atmospheric_morado_planks_diagonal_tiles_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_MORADO_PLANKS_DOTTED = BLOCKS.register("atmospheric_morado_planks_dotted", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_MORADO_PLANKS_DOTTED_CONNECTING = BLOCKS.register("atmospheric_morado_planks_dotted_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_MORADO_PLANKS_FLOORING = BLOCKS.register("atmospheric_morado_planks_flooring", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_MORADO_PLANKS_FLOORING_CONNECTING = BLOCKS.register("atmospheric_morado_planks_flooring_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_MORADO_PLANKS_LARGE_TILES = BLOCKS.register("atmospheric_morado_planks_large_tiles", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_MORADO_PLANKS_LARGE_TILES_CONNECTING = BLOCKS.register("atmospheric_morado_planks_large_tiles_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_MORADO_PLANKS_PATTERN = BLOCKS.register("atmospheric_morado_planks_pattern", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_MORADO_PLANKS_PATTERN_CONNECTING = BLOCKS.register("atmospheric_morado_planks_pattern_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_MORADO_PLANKS_SMALL_BRICKS = BLOCKS.register("atmospheric_morado_planks_small_bricks", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_MORADO_PLANKS_SMALL_BRICKS_CONNECTING = BLOCKS.register("atmospheric_morado_planks_small_bricks_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_MORADO_PLANKS_SMALL_TILES = BLOCKS.register("atmospheric_morado_planks_small_tiles", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_MORADO_PLANKS_SMALL_TILES_CONNECTING = BLOCKS.register("atmospheric_morado_planks_small_tiles_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_MORADO_PLANKS_SQUARES = BLOCKS.register("atmospheric_morado_planks_squares", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_MORADO_PLANKS_SQUARES_CONNECTING = BLOCKS.register("atmospheric_morado_planks_squares_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_MORADO_PLANKS_TILES = BLOCKS.register("atmospheric_morado_planks_tiles", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_MORADO_PLANKS_TILES_CONNECTING = BLOCKS.register("atmospheric_morado_planks_tiles_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_MORADO_PLANKS_WAVY = BLOCKS.register("atmospheric_morado_planks_wavy", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_MORADO_PLANKS_WAVY_CONNECTING = BLOCKS.register("atmospheric_morado_planks_wavy_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_MORADO_PLANKS_WOVEN = BLOCKS.register("atmospheric_morado_planks_woven", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_MORADO_PLANKS_WOVEN_CONNECTING = BLOCKS.register("atmospheric_morado_planks_woven_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_ROSEWOOD_PLANKS_BEAMS = BLOCKS.register("atmospheric_rosewood_planks_beams", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_ROSEWOOD_PLANKS_BEAMS_CONNECTING = BLOCKS.register("atmospheric_rosewood_planks_beams_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_ROSEWOOD_PLANKS_BRICKS = BLOCKS.register("atmospheric_rosewood_planks_bricks", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_ROSEWOOD_PLANKS_BRICKS_CONNECTING = BLOCKS.register("atmospheric_rosewood_planks_bricks_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_ROSEWOOD_PLANKS_CRATE = BLOCKS.register("atmospheric_rosewood_planks_crate", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_ROSEWOOD_PLANKS_CRATE_CONNECTING = BLOCKS.register("atmospheric_rosewood_planks_crate_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_ROSEWOOD_PLANKS_DIAGONAL_STRIPES = BLOCKS.register("atmospheric_rosewood_planks_diagonal_stripes", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_ROSEWOOD_PLANKS_DIAGONAL_STRIPES_CONNECTING = BLOCKS.register("atmospheric_rosewood_planks_diagonal_stripes_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_ROSEWOOD_PLANKS_DIAGONAL_TILES = BLOCKS.register("atmospheric_rosewood_planks_diagonal_tiles", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_ROSEWOOD_PLANKS_DIAGONAL_TILES_CONNECTING = BLOCKS.register("atmospheric_rosewood_planks_diagonal_tiles_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_ROSEWOOD_PLANKS_DOTTED = BLOCKS.register("atmospheric_rosewood_planks_dotted", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_ROSEWOOD_PLANKS_DOTTED_CONNECTING = BLOCKS.register("atmospheric_rosewood_planks_dotted_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_ROSEWOOD_PLANKS_FLOORING = BLOCKS.register("atmospheric_rosewood_planks_flooring", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_ROSEWOOD_PLANKS_FLOORING_CONNECTING = BLOCKS.register("atmospheric_rosewood_planks_flooring_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_ROSEWOOD_PLANKS_LARGE_TILES = BLOCKS.register("atmospheric_rosewood_planks_large_tiles", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_ROSEWOOD_PLANKS_LARGE_TILES_CONNECTING = BLOCKS.register("atmospheric_rosewood_planks_large_tiles_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_ROSEWOOD_PLANKS_PATTERN = BLOCKS.register("atmospheric_rosewood_planks_pattern", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_ROSEWOOD_PLANKS_PATTERN_CONNECTING = BLOCKS.register("atmospheric_rosewood_planks_pattern_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_ROSEWOOD_PLANKS_SMALL_BRICKS = BLOCKS.register("atmospheric_rosewood_planks_small_bricks", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_ROSEWOOD_PLANKS_SMALL_BRICKS_CONNECTING = BLOCKS.register("atmospheric_rosewood_planks_small_bricks_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_ROSEWOOD_PLANKS_SMALL_TILES = BLOCKS.register("atmospheric_rosewood_planks_small_tiles", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_ROSEWOOD_PLANKS_SMALL_TILES_CONNECTING = BLOCKS.register("atmospheric_rosewood_planks_small_tiles_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_ROSEWOOD_PLANKS_SQUARES = BLOCKS.register("atmospheric_rosewood_planks_squares", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_ROSEWOOD_PLANKS_SQUARES_CONNECTING = BLOCKS.register("atmospheric_rosewood_planks_squares_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_ROSEWOOD_PLANKS_TILES = BLOCKS.register("atmospheric_rosewood_planks_tiles", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_ROSEWOOD_PLANKS_TILES_CONNECTING = BLOCKS.register("atmospheric_rosewood_planks_tiles_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_ROSEWOOD_PLANKS_WAVY = BLOCKS.register("atmospheric_rosewood_planks_wavy", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_ROSEWOOD_PLANKS_WAVY_CONNECTING = BLOCKS.register("atmospheric_rosewood_planks_wavy_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_ROSEWOOD_PLANKS_WOVEN = BLOCKS.register("atmospheric_rosewood_planks_woven", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_ROSEWOOD_PLANKS_WOVEN_CONNECTING = BLOCKS.register("atmospheric_rosewood_planks_woven_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_YUCCA_PLANKS_BEAMS = BLOCKS.register("atmospheric_yucca_planks_beams", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_YUCCA_PLANKS_BEAMS_CONNECTING = BLOCKS.register("atmospheric_yucca_planks_beams_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_YUCCA_PLANKS_BRICKS = BLOCKS.register("atmospheric_yucca_planks_bricks", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_YUCCA_PLANKS_BRICKS_CONNECTING = BLOCKS.register("atmospheric_yucca_planks_bricks_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_YUCCA_PLANKS_CRATE = BLOCKS.register("atmospheric_yucca_planks_crate", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_YUCCA_PLANKS_CRATE_CONNECTING = BLOCKS.register("atmospheric_yucca_planks_crate_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_YUCCA_PLANKS_DIAGONAL_STRIPES = BLOCKS.register("atmospheric_yucca_planks_diagonal_stripes", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_YUCCA_PLANKS_DIAGONAL_STRIPES_CONNECTING = BLOCKS.register("atmospheric_yucca_planks_diagonal_stripes_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_YUCCA_PLANKS_DIAGONAL_TILES = BLOCKS.register("atmospheric_yucca_planks_diagonal_tiles", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_YUCCA_PLANKS_DIAGONAL_TILES_CONNECTING = BLOCKS.register("atmospheric_yucca_planks_diagonal_tiles_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_YUCCA_PLANKS_DOTTED = BLOCKS.register("atmospheric_yucca_planks_dotted", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_YUCCA_PLANKS_DOTTED_CONNECTING = BLOCKS.register("atmospheric_yucca_planks_dotted_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_YUCCA_PLANKS_FLOORING = BLOCKS.register("atmospheric_yucca_planks_flooring", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_YUCCA_PLANKS_FLOORING_CONNECTING = BLOCKS.register("atmospheric_yucca_planks_flooring_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_YUCCA_PLANKS_LARGE_TILES = BLOCKS.register("atmospheric_yucca_planks_large_tiles", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_YUCCA_PLANKS_LARGE_TILES_CONNECTING = BLOCKS.register("atmospheric_yucca_planks_large_tiles_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_YUCCA_PLANKS_PATTERN = BLOCKS.register("atmospheric_yucca_planks_pattern", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_YUCCA_PLANKS_PATTERN_CONNECTING = BLOCKS.register("atmospheric_yucca_planks_pattern_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_YUCCA_PLANKS_SMALL_BRICKS = BLOCKS.register("atmospheric_yucca_planks_small_bricks", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_YUCCA_PLANKS_SMALL_BRICKS_CONNECTING = BLOCKS.register("atmospheric_yucca_planks_small_bricks_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_YUCCA_PLANKS_SMALL_TILES = BLOCKS.register("atmospheric_yucca_planks_small_tiles", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_YUCCA_PLANKS_SMALL_TILES_CONNECTING = BLOCKS.register("atmospheric_yucca_planks_small_tiles_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_YUCCA_PLANKS_SQUARES = BLOCKS.register("atmospheric_yucca_planks_squares", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_YUCCA_PLANKS_SQUARES_CONNECTING = BLOCKS.register("atmospheric_yucca_planks_squares_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_YUCCA_PLANKS_TILES = BLOCKS.register("atmospheric_yucca_planks_tiles", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_YUCCA_PLANKS_TILES_CONNECTING = BLOCKS.register("atmospheric_yucca_planks_tiles_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_YUCCA_PLANKS_WAVY = BLOCKS.register("atmospheric_yucca_planks_wavy", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_YUCCA_PLANKS_WAVY_CONNECTING = BLOCKS.register("atmospheric_yucca_planks_wavy_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_YUCCA_PLANKS_WOVEN = BLOCKS.register("atmospheric_yucca_planks_woven", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  ATMOSPHERIC_YUCCA_PLANKS_WOVEN_CONNECTING = BLOCKS.register("atmospheric_yucca_planks_woven_connecting", ()-> new ChiseledBlock(true, getProperties()));

    public static AbstractBlock.Properties getProperties() {
        return AbstractBlock.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD);    }
}