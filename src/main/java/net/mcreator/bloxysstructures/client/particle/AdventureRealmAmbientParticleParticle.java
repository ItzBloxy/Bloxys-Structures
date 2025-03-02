
package net.mcreator.bloxysstructures.client.particle;

import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.client.particle.TextureSheetParticle;
import net.minecraft.client.particle.SpriteSet;
import net.minecraft.client.particle.ParticleRenderType;
import net.minecraft.client.particle.ParticleProvider;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.multiplayer.ClientLevel;

@OnlyIn(Dist.CLIENT)
public class AdventureRealmAmbientParticleParticle extends TextureSheetParticle {
	public static AdventureRealmAmbientParticleParticleProvider provider(SpriteSet spriteSet) {
		return new AdventureRealmAmbientParticleParticleProvider(spriteSet);
	}

	public static class AdventureRealmAmbientParticleParticleProvider implements ParticleProvider<SimpleParticleType> {
		private final SpriteSet spriteSet;

		public AdventureRealmAmbientParticleParticleProvider(SpriteSet spriteSet) {
			this.spriteSet = spriteSet;
		}

		public Particle createParticle(SimpleParticleType typeIn, ClientLevel worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed) {
			return new AdventureRealmAmbientParticleParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed, this.spriteSet);
		}
	}

	private final SpriteSet spriteSet;

	protected AdventureRealmAmbientParticleParticle(ClientLevel world, double x, double y, double z, double vx, double vy, double vz, SpriteSet spriteSet) {
		super(world, x, y, z);
		this.spriteSet = spriteSet;
		this.setSize(0.1f, 0.1f);
		this.quadSize *= 0.4f;
		this.lifetime = (int) Math.max(1, 10 + (this.random.nextInt(10) - 5));
		this.gravity = 0.1f;
		this.hasPhysics = false;
		this.xd = vx * 1.5;
		this.yd = vy * 1.5;
		this.zd = vz * 1.5;
		this.setSpriteFromAge(spriteSet);
	}

	@Override
	public ParticleRenderType getRenderType() {
		return ParticleRenderType.PARTICLE_SHEET_OPAQUE;
	}

	@Override
	public void tick() {
		super.tick();
		if (!this.removed) {
			this.setSprite(this.spriteSet.get((this.age / 5) % 8 + 1, 8));
		}
	}
}
