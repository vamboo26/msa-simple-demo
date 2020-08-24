package io.zingoworks.licensingservice;

import java.util.UUID;
import org.springframework.stereotype.Service;

@Service
public class LicenseService {

    public License getLicense(String licenseId) {
        return new License()
            .withId(licenseId)
            .withOrganizationId(UUID.randomUUID().toString())
            .withProductName("Test Product Name")
            .withLicenseType("PerSeat");
    }

    public void saveLicense(License license) {

    }

    public void updateLicense(License license) {

    }

    public void deleteLicense(License license) {

    }

}
