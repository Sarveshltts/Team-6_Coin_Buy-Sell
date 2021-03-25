package net.codejava.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import net.codejava.model.Coin;

public interface CoinRepository extends JpaRepository<Coin, Integer> {
	@Query("SELECT u FROM Coin u WHERE u.coinid = ?1")
	public Coin findByCoinId(int cid);
	@Query("SELECT u FROM Coin u WHERE u.buy = 'Buy'")
	public List<Coin> findByBuyId();
	@Query("SELECT u FROM Coin u WHERE u.buy = 'Bought'")
	public List<Coin> findByBought();
	@Query("SELECT u FROM Coin u WHERE u.email = ?1")
	public List<Coin> findByEmail(String email);
	
}