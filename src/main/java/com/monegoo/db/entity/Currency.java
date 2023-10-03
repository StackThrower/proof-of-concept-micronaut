package com.monegoo.db.entity;

import io.micronaut.serde.annotation.Serdeable;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Serdeable
@Entity
@Table(name="currencies")
public class Currency {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "timestamp", nullable = false)
    private Long timestamp;

    @Column(name = "AED_CURRENCY", nullable = false, scale = 8, precision = 25)
    private BigDecimal AED;

    @Column(name = "AFN_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal AFN;

    @Column(name = "ALL_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal ALL;

    @Column(name = "AMD_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal AMD;

    @Column(name = "ANG_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal ANG;

    @Column(name = "AOA_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal AOA;

    @Column(name = "ARS_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal ARS;

    @Column(name = "AUD_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal AUD;

    @Column(name = "AWG_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal AWG;

    @Column(name = "AZN_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal AZN;

    @Column(name = "BAM_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal BAM;

    @Column(name = "BBD_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal BBD;

    @Column(name = "BDT_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal BDT;

    @Column(name = "BGN_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal BGN;

    @Column(name = "BHD_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal BHD;

    @Column(name = "BIF_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal BIF;

    @Column(name = "BMD_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal BMD;

    @Column(name = "BND_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal BND;

    @Column(name = "BOB_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal BOB;

    @Column(name = "BRL_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal BRL;

    @Column(name = "BSD_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal BSD;

    @Column(name = "BTC_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal BTC;

    @Column(name = "BTN_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal BTN;

    @Column(name = "BWP_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal BWP;

    @Column(name = "BYN_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal BYN;

    @Column(name = "BZD_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal BZD;

    @Column(name = "CAD_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal CAD;

    @Column(name = "CDF_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal CDF;

    @Column(name = "CHF_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal CHF;

    @Column(name = "CLF_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal CLF;

    @Column(name = "CLP_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal CLP;

    @Column(name = "CNH_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal CNH;

    @Column(name = "CNY_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal CNY;

    @Column(name = "COP_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal COP;

    @Column(name = "CRC_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal CRC;

    @Column(name = "CUC_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal CUC;

    @Column(name = "CUP_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal CUP;

    @Column(name = "CVE_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal CVE;

    @Column(name = "CZK_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal CZK;

    @Column(name = "DJF_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal DJF;

    @Column(name = "DKK_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal DKK;

    @Column(name = "DOP_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal DOP;

    @Column(name = "DZD_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal DZD;

    @Column(name = "EGP_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal EGP;

    @Column(name = "ERN_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal ERN;

    @Column(name = "ETB_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal ETB;

    @Column(name = "EUR_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal EUR;

    @Column(name = "FJD_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal FJD;

    @Column(name = "FKP_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal FKP;

    @Column(name = "GBP_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal GBP;

    @Column(name = "GEL_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal GEL;

    @Column(name = "GGP_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal GGP;

    @Column(name = "GHS_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal GHS;

    @Column(name = "GIP_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal GIP;

    @Column(name = "GMD_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal GMD;

    @Column(name = "GNF_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal GNF;

    @Column(name = "GTQ_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal GTQ;

    @Column(name = "GYD_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal GYD;

    @Column(name = "HKD_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal HKD;

    @Column(name = "HNL_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal HNL;

    @Column(name = "HRK_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal HRK;

    @Column(name = "HTG_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal HTG;

    @Column(name = "HUF_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal HUF;

    @Column(name = "IDR_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal IDR;

    @Column(name = "ILS_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal ILS;

    @Column(name = "IMP_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal IMP;

    @Column(name = "INR_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal INR;

    @Column(name = "IQD_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal IQD;

    @Column(name = "IRR_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal IRR;

    @Column(name = "ISK_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal ISK;

    @Column(name = "JEP_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal JEP;

    @Column(name = "JMD_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal JMD;

    @Column(name = "JOD_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal JOD;

    @Column(name = "JPY_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal JPY;

    @Column(name = "KES_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal KES;

    @Column(name = "KGS_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal KGS;

    @Column(name = "KHR_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal KHR;

    @Column(name = "KMF_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal KMF;

    @Column(name = "KPW_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal KPW;

    @Column(name = "KRW_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal KRW;

    @Column(name = "KWD_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal KWD;

    @Column(name = "KYD_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal KYD;

    @Column(name = "KZT_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal KZT;

    @Column(name = "LAK_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal LAK;

    @Column(name = "LBP_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal LBP;

    @Column(name = "LKR_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal LKR;

    @Column(name = "LRD_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal LRD;

    @Column(name = "LSL_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal LSL;

    @Column(name = "LYD_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal LYD;

    @Column(name = "MAD_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal MAD;

    @Column(name = "MDL_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal MDL;

    @Column(name = "MGA_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal MGA;

    @Column(name = "MKD_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal MKD;

    @Column(name = "MMK_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal MMK;

    @Column(name = "MNT_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal MNT;

    @Column(name = "MOP_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal MOP;

    @Column(name = "MRU_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal MRU;

    @Column(name = "MUR_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal MUR;

    @Column(name = "MVR_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal MVR;

    @Column(name = "MWK_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal MWK;

    @Column(name = "MXN_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal MXN;

    @Column(name = "MYR_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal MYR;

    @Column(name = "MZN_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal MZN;

    @Column(name = "NAD_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal NAD;

    @Column(name = "NGN_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal NGN;

    @Column(name = "NIO_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal NIO;

    @Column(name = "NOK_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal NOK;

    @Column(name = "NPR_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal NPR;

    @Column(name = "NZD_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal NZD;

    @Column(name = "OMR_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal OMR;

    @Column(name = "PAB_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal PAB;

    @Column(name = "PEN_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal PEN;

    @Column(name = "PGK_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal PGK;

    @Column(name = "PHP_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal PHP;

    @Column(name = "PKR_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal PKR;

    @Column(name = "PLN_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal PLN;

    @Column(name = "PYG_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal PYG;

    @Column(name = "QAR_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal QAR;

    @Column(name = "RON_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal RON;

    @Column(name = "RSD_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal RSD;

    @Column(name = "RUB_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal RUB;

    @Column(name = "RWF_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal RWF;

    @Column(name = "SAR_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal SAR;

    @Column(name = "SBD_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal SBD;

    @Column(name = "SCR_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal SCR;

    @Column(name = "SDG_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal SDG;

    @Column(name = "SEK_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal SEK;

    @Column(name = "SGD_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal SGD;

    @Column(name = "SHP_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal SHP;

    @Column(name = "SLL_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal SLL;

    @Column(name = "SOS_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal SOS;

    @Column(name = "SRD_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal SRD;

    @Column(name = "SSP_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal SSP;

    @Column(name = "STD_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal STD;

    @Column(name = "STN_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal STN;

    @Column(name = "SVC_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal SVC;

    @Column(name = "SYP_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal SYP;

    @Column(name = "SZL_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal SZL;

    @Column(name = "THB_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal THB;

    @Column(name = "TJS_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal TJS;

    @Column(name = "TMT_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal TMT;

    @Column(name = "TND_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal TND;

    @Column(name = "TOP_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal TOP;

    @Column(name = "TRY_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal TRY;

    @Column(name = "TTD_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal TTD;

    @Column(name = "TWD_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal TWD;

    @Column(name = "TZS_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal TZS;

    @Column(name = "UAH_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal UAH;

    @Column(name = "UGX_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal UGX;

    @Column(name = "USD_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal USD;

    @Column(name = "UYU_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal UYU;

    @Column(name = "UZS_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal UZS;

    @Column(name = "VES_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal VES;

    @Column(name = "VND_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal VND;

    @Column(name = "VUV_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal VUV;

    @Column(name = "WST_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal WST;

    @Column(name = "XAF_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal XAF;

    @Column(name = "XAG_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal XAG;

    @Column(name = "XAU_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal XAU;

    @Column(name = "XCD_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal XCD;

    @Column(name = "XDR_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal XDR;

    @Column(name = "XOF_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal XOF;

    @Column(name = "XPD_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal XPD;

    @Column(name = "XPF_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal XPF;

    @Column(name = "XPT_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal XPT;

    @Column(name = "YER_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal YER;

    @Column(name = "ZAR_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal ZAR;

    @Column(name = "ZMW_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal ZMW;

    @Column(name = "ZWL_CURRENCY", nullable = false, scale = 8, precision = 25)
    BigDecimal ZWL;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public BigDecimal getAED() {
        return AED;
    }

    public void setAED(BigDecimal AED) {
        this.AED = AED;
    }
}
