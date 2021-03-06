package com.wallet.repository;

import com.wallet.domain.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface WalletRepository
        extends JpaRepository<Wallet, UUID> {
}
