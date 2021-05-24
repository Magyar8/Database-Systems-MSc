package myBatis_LeagueofLegends;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class DAO {
			
		// champion felvitele
		public void saveChampion(Champion champion) {
			SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
			session.insert("myBatis_LeagueofLegends.ChampionMapper.insertChampion", champion);
			session.commit();
			session.close();
		}
		
		// skin felvitele a shop-ba
		public void saveShop(Shop shop) {
			SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
			session.insert("myBatis_LeagueofLegends.ShopMapper.insertShop", shop);
			session.commit();
			session.close();
		}
		
		// skin hozz�rendel�se champion-hoz 
		public void champshop(ChampShop champShop) {
			SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
			session.insert("myBatis_LeagueofLegends.CampShop.campShop", champShop);
			session.commit();
			session.close();
		}
		
		// champion neh�zs�g�nek m�dos�t�sa
		public void updateDifficulty(Champion champion) {
			SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
			session.update("myBatis_LeagueofLegends.ChampionMapper.updateDifficulty", champion);
			session.commit();
			session.close();
		}
		
		// champion szerep�nek m�dos�t�sa
		public void updateRole(Champion champion) {
			SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
			session.update("myBatis_LeagueofLegends.ChampionMapper.updateRole", champion);
			session.commit();
			session.close();
		}
		
		// Skin �r�nak m�dos�t�sa
		public void updatePrice(Shop shop) {
			SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
			session.update("myBatis_LeagueofLegends.ShopMapper.updatePrice", shop);
			session.commit();
			session.close();
		}
		
		// Champion skin-�nek m�dos�t�sa
		public void updateShop(Shop shop) {
			SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
			session.update("myBatis_LeagueofLegends.ShopMapper.updateShop", shop);
			session.commit();
			session.close();
		}

		// champion t�rl�se
		public void deleteChampion(int id) {
			SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
			session.delete("myBatis_LeagueofLegends.ChampionMapper.deleteChampion", id);
			session.commit();
			session.close();
		}
		
		// skin t�rl�se
		public void deleteSkin(int id) {
			SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
			session.delete("myBatis_LeagueofLegends.ShopMapper.deleteSkin", id);
			session.commit();
			session.close();
		}
		
		// �sszes champion lek�rdez�se
		public List<Champion> findAllChampion() {
			SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
			List<Champion> champions = session.selectList("myBatis_LeagueofLegends.ChampionMapper.findAllChampion");
			session.close();
			return champions;
		}
		
		// �sszes skin lek�rdez�se
		public List<Shop> findAllSkin() {
			SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
			List<Shop> skins = session.selectList("myBatis_LeagueofLegends.ShopMapper.findAllSkin");
			session.close();
			return skins;
		}
		
		// Param�terk�nt megadott champion-hoz milyen skin tartozik
		public List<Shop> SkinByChampion(int id) {
			SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
			List<Shop> skins = session.selectList("myBatis_LeagueofLegends.ShopMapper.selectSkinByChampion", id);
			session.close();
			return skins;
		}
}
