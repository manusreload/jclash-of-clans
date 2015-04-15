package coc.protocol;

/**
 *
 * @author manus
 */
public class Constants {

    public static final String RC4_KEY = "fhsd6f86f67rt8fw78fw789we78r9789wer6re";

    public static boolean DEBUG_PACKETS = true;
    
    public static final String PROTOCOL = "[\n" +
"    {\n" +
"        \"title\": \"AccountSwitchedMessage\",\n" +
"        \"type\": 10118,\n" +
"        \"types\": [\n" +
"            \"Long\"\n" +
"        ],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"SwitchedToAccountId\",\n" +
"                \"type\": \"Long\",\n" +
"                \"register\": \"0x30\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"AppleBillingProcessedByServerMessage\",\n" +
"        \"type\": 20151,\n" +
"        \"types\": [\n" +
"            \"String\",\n" +
"            \"String\",\n" +
"            \"Int\"\n" +
"        ],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"TID\",\n" +
"                \"type\": \"String\",\n" +
"                \"register\": \"0x30\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"ProdId\",\n" +
"                \"type\": \"String\",\n" +
"                \"register\": \"0x48\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"StatusCode\",\n" +
"                \"type\": \"Int\",\n" +
"                \"register\": \"0x60\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"AppleBillingRequestMessage\",\n" +
"        \"type\": 10150,\n" +
"        \"types\": [\n" +
"            \"String\",\n" +
"            \"String\",\n" +
"            \"String\",\n" +
"            \"String\",\n" +
"            \"Bytes\"\n" +
"        ],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"ReceiptData\",\n" +
"                \"type\": null,\n" +
"                \"register\": \"0x90\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"TID\",\n" +
"                \"type\": \"String\",\n" +
"                \"register\": \"0x30\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"ProdID\",\n" +
"                \"type\": \"String\",\n" +
"                \"register\": \"0x48\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"CurrencyCode\",\n" +
"                \"type\": \"String\",\n" +
"                \"register\": \"0x60\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"Price\",\n" +
"                \"type\": \"String\",\n" +
"                \"register\": \"0x78\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"AuthenticationCheckMessage\",\n" +
"        \"type\": 10112,\n" +
"        \"types\": [],\n" +
"        \"fields\": []\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"AuthenticationResponseMessage\",\n" +
"        \"type\": 20104,\n" +
"        \"types\": [\n" +
"            \"Boolean\"\n" +
"        ],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"Authenticated\",\n" +
"                \"type\": \"Boolean\",\n" +
"                \"register\": \"0x30\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"BillingRequestFailedMessage\",\n" +
"        \"type\": 20121,\n" +
"        \"types\": [\n" +
"            \"Int\",\n" +
"            \"String\"\n" +
"        ],\n" +
"        \"fields\": []\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"ChatAccountBanStatusMessage\",\n" +
"        \"type\": 20118,\n" +
"        \"types\": [],\n" +
"        \"fields\": []\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"ClientCapabilitiesMessage\",\n" +
"        \"type\": 10107,\n" +
"        \"types\": [\n" +
"            \"String\",\n" +
"            \"Int\",\n" +
"            \"Int\",\n" +
"            \"Int\",\n" +
"            \"Int\"\n" +
"        ],\n" +
"        \"fields\": []\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"CreateAccountFailedMessage\",\n" +
"        \"type\": 20101,\n" +
"        \"types\": [],\n" +
"        \"fields\": []\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"DisconnectedMessage\",\n" +
"        \"type\": 25892,\n" +
"        \"types\": [\n" +
"            \"Int\"\n" +
"        ],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"Reason\",\n" +
"                \"type\": \"Int\",\n" +
"                \"register\": \"0x30\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"GoogleBillingProcessedByServerMessage\",\n" +
"        \"type\": 20152,\n" +
"        \"types\": [\n" +
"            \"String\",\n" +
"            \"String\",\n" +
"            \"Int\"\n" +
"        ],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"TID\",\n" +
"                \"type\": \"String\",\n" +
"                \"register\": \"0x30\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"ProdId\",\n" +
"                \"type\": \"String\",\n" +
"                \"register\": \"0x48\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"StatusCode\",\n" +
"                \"type\": \"Int\",\n" +
"                \"register\": \"0x60\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"GoogleBillingRequestMessage\",\n" +
"        \"type\": 10151,\n" +
"        \"types\": [\n" +
"            \"String\",\n" +
"            \"String\",\n" +
"            \"String\",\n" +
"            \"String\",\n" +
"            \"String\",\n" +
"            \"String\"\n" +
"        ],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"PurchaseData\",\n" +
"                \"type\": \"String\",\n" +
"                \"register\": \"0x90\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"Signature\",\n" +
"                \"type\": \"String\",\n" +
"                \"register\": \"0xA8\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"TID\",\n" +
"                \"type\": \"String\",\n" +
"                \"register\": \"0x30\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"ProdID\",\n" +
"                \"type\": \"String\",\n" +
"                \"register\": \"0x48\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"CurrencyCode\",\n" +
"                \"type\": \"String\",\n" +
"                \"register\": \"0x60\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"Price\",\n" +
"                \"type\": \"String\",\n" +
"                \"register\": \"0x78\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"KeepAliveMessage\",\n" +
"        \"type\": 10108,\n" +
"        \"types\": [],\n" +
"        \"fields\": []\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"LoginFailedMessage\",\n" +
"        \"type\": 20103,\n" +
"        \"types\": [\n" +
"            \"Int\",\n" +
"            \"String\",\n" +
"            \"String\",\n" +
"            \"String\",\n" +
"            \"String\",\n" +
"            \"String\"\n" +
"        ],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"ErrorCode\",\n" +
"                \"type\": \"Int\",\n" +
"                \"register\": \"0x30\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"ResourceFingerprintData\",\n" +
"                \"type\": \"String\",\n" +
"                \"register\": \"0x34\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"RedirectDomain\",\n" +
"                \"type\": \"String\",\n" +
"                \"register\": \"0x38\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"ContentURL\",\n" +
"                \"type\": \"String\",\n" +
"                \"register\": \"0x3C\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"UpdateURL\",\n" +
"                \"type\": \"String\",\n" +
"                \"register\": \"0x40\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"Reason\",\n" +
"                \"type\": \"String\",\n" +
"                \"register\": \"0x44\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"LoginMessage\",\n" +
"        \"type\": 10101,\n" +
"        \"types\": [\n" +
"            \"Long\",\n" +
"            \"String\",\n" +
"            \"Int\",\n" +
"            \"Int\",\n" +
"            \"Int\",\n" +
"            \"String\",\n" +
"            \"String\",\n" +
"            \"String\",\n" +
"            \"String\",\n" +
"            \"String\",\n" +
"            \"DataReference\",\n" +
"            \"String\",\n" +
"            \"String\",\n" +
"            \"String\",\n" +
"            \"Boolean\",\n" +
"            \"StringReference\",\n" +
"            \"StringReference\"\n" +
"        ],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"AccountId\",\n" +
"                \"type\": \"Long\",\n" +
"                \"register\": \"0x30\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"PassToken\",\n" +
"                \"type\": \"String\",\n" +
"                \"register\": \"0x34\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"ClientMajorVersion\",\n" +
"                \"type\": \"Int\",\n" +
"                \"register\": \"0x38\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"ClientBuild\",\n" +
"                \"type\": \"Int\",\n" +
"                \"register\": \"0x3C\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"ResourceSha\",\n" +
"                \"type\": \"String\",\n" +
"                \"register\": \"0x40\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"UDID\",\n" +
"                \"type\": \"String\",\n" +
"                \"register\": \"0x44\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"ADID\",\n" +
"                \"type\": \"String\",\n" +
"                \"register\": \"0x70\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"OSVersion\",\n" +
"                \"type\": \"String\",\n" +
"                \"register\": \"0x74\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"OpenUDID\",\n" +
"                \"type\": \"String\",\n" +
"                \"register\": \"0x48\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"MacAddress\",\n" +
"                \"type\": \"String\",\n" +
"                \"register\": \"0x4C\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"Device\",\n" +
"                \"type\": \"String\",\n" +
"                \"register\": \"0x50\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"PreferredLanguage\",\n" +
"                \"type\": \"DataReference\",\n" +
"                \"register\": \"0x6C\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"PreferredDeviceLanguage\",\n" +
"                \"type\": \"String\",\n" +
"                \"register\": \"0x54\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"Android\",\n" +
"                \"type\": \"Boolean\",\n" +
"                \"register\": \"0xA8\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"IMEI\",\n" +
"                \"type\": \"StringReference\",\n" +
"                \"register\": \"0x78\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"AndroidID\",\n" +
"                \"type\": \"StringReference\",\n" +
"                \"register\": \"0x90\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"LoginOkMessage\",\n" +
"        \"type\": 20104,\n" +
"        \"types\": [\n" +
"            \"Long\",\n" +
"            \"Long\",\n" +
"            \"String\",\n" +
"            \"String\",\n" +
"            \"String\",\n" +
"            \"Int\",\n" +
"            \"Int\",\n" +
"            \"Int\",\n" +
"            \"String\",\n" +
"            \"Int\",\n" +
"            \"Int\",\n" +
"            \"Int\",\n" +
"            \"String\",\n" +
"            \"String\",\n" +
"            \"String\",\n" +
"            \"Int\",\n" +
"            \"String\"\n" +
"        ],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"AccountId\",\n" +
"                \"type\": \"Long\",\n" +
"                \"register\": \"0x30\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"HomeId\",\n" +
"                \"type\": \"Long\",\n" +
"                \"register\": \"0x34\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"PassToken\",\n" +
"                \"type\": \"String\",\n" +
"                \"register\": \"0x38\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"FacebookId\",\n" +
"                \"type\": \"String\",\n" +
"                \"register\": \"0x3C\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"GamecenterId\",\n" +
"                \"type\": \"String\",\n" +
"                \"register\": \"0x40\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"ServerMajorVersion\",\n" +
"                \"type\": \"Int\",\n" +
"                \"register\": \"0x4C\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"ServerBuild\",\n" +
"                \"type\": \"Int\",\n" +
"                \"register\": \"0x50\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"ContentVersion\",\n" +
"                \"type\": \"Int\",\n" +
"                \"register\": \"0x54\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"ServerEnvironment\",\n" +
"                \"type\": \"String\",\n" +
"                \"register\": \"0x58\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"PlayTimeSeconds\",\n" +
"                \"type\": \"Int\",\n" +
"                \"register\": \"0x60\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"FacebookAppId\",\n" +
"                \"type\": \"String\",\n" +
"                \"register\": \"0x48\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"SessionCount\",\n" +
"                \"type\": \"Int\",\n" +
"                \"register\": \"0x5C\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"DaysSinceStartedPlaying\",\n" +
"                \"type\": \"Int\",\n" +
"                \"register\": \"0x64\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"ServerTime\",\n" +
"                \"type\": \"String\",\n" +
"                \"register\": \"0x68\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"AccountCreatedDate\",\n" +
"                \"type\": \"String\",\n" +
"                \"register\": \"0x6C\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"StartupCooldownSeconds\",\n" +
"                \"type\": \"Int\",\n" +
"                \"register\": \"0x70\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"GoogleServiceId\",\n" +
"                \"type\": \"String\",\n" +
"                \"register\": \"0x44\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"LoginUsingSessionMessage\",\n" +
"        \"type\": 10102,\n" +
"        \"types\": [\n" +
"            \"Int\",\n" +
"            \"Int\",\n" +
"            \"String\",\n" +
"            \"String\",\n" +
"            \"String\",\n" +
"            \"String\",\n" +
"            \"String\"\n" +
"        ],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"AccountId\",\n" +
"                \"type\": \"Int\",\n" +
"                \"register\": \"0x30\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"AccountId\",\n" +
"                \"type\": \"Int\",\n" +
"                \"register\": \"0x30\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"ClientGameVersion\",\n" +
"                \"type\": null,\n" +
"                \"register\": \"0x38\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"SessionKey\",\n" +
"                \"type\": \"String\",\n" +
"                \"register\": \"0x3C\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"FacebookAccessToken\",\n" +
"                \"type\": \"String\",\n" +
"                \"register\": \"0x40\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"Source\",\n" +
"                \"type\": \"String\",\n" +
"                \"register\": \"0x44\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"DeviceIdentifier\",\n" +
"                \"type\": \"String\",\n" +
"                \"register\": \"0x48\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"PersonalBreakStartedMessage\",\n" +
"        \"type\": 20171,\n" +
"        \"types\": [\n" +
"            \"Int\"\n" +
"        ],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"SecondsUntilBreak\",\n" +
"                \"type\": \"Int\",\n" +
"                \"register\": \"0x30\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"ReportUserMessage\",\n" +
"        \"type\": 10117,\n" +
"        \"types\": [\n" +
"            \"Int\"\n" +
"        ],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"ReportedAvatarId\",\n" +
"                \"type\": \"?\",\n" +
"                \"register\": \"0x34\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"ReportUserStatusMessage\",\n" +
"        \"type\": 20117,\n" +
"        \"types\": [],\n" +
"        \"fields\": []\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"ShutdownStartedMessage\",\n" +
"        \"type\": 20161,\n" +
"        \"types\": [\n" +
"            \"Int\"\n" +
"        ],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"SecondsUntilShutdown\",\n" +
"                \"type\": \"Int\",\n" +
"                \"register\": \"0x30\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"AllianceChangeFailedMessage\",\n" +
"        \"type\": 24333,\n" +
"        \"types\": [\n" +
"            \"Int\"\n" +
"        ],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"Reason\",\n" +
"                \"type\": \"Int\",\n" +
"                \"register\": \"0x30\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"AllianceCreateFailedMessage\",\n" +
"        \"type\": 24332,\n" +
"        \"types\": [\n" +
"            \"Int\"\n" +
"        ],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"Reason\",\n" +
"                \"type\": \"Int\",\n" +
"                \"register\": \"0x30\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"AllianceDataMessage\",\n" +
"        \"type\": 24301,\n" +
"        \"types\": [],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"AllianceFullEntry\",\n" +
"                \"type\": \"?\",\n" +
"                \"register\": \"0x30\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"AllianceInvitationSendFailedMessage\",\n" +
"        \"type\": 24321,\n" +
"        \"types\": [\n" +
"            \"Int\"\n" +
"        ],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"Reason\",\n" +
"                \"type\": \"Int\",\n" +
"                \"register\": \"0x30\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"AllianceInvitationSentOkMessage\",\n" +
"        \"type\": 24322,\n" +
"        \"types\": [],\n" +
"        \"fields\": []\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"AllianceJoinFailedMessage\",\n" +
"        \"type\": 24302,\n" +
"        \"types\": [\n" +
"            \"Int\"\n" +
"        ],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"Reason\",\n" +
"                \"type\": \"Int\",\n" +
"                \"register\": \"0x30\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"AllianceJoinOkMessage\",\n" +
"        \"type\": 24303,\n" +
"        \"types\": [],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"Role\",\n" +
"                \"type\": null,\n" +
"                \"register\": \"0x34\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"AllianceJoinRequestFailedMessage\",\n" +
"        \"type\": 24320,\n" +
"        \"types\": [\n" +
"            \"Int\"\n" +
"        ],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"Reason\",\n" +
"                \"type\": \"Int\",\n" +
"                \"register\": \"0x30\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"AllianceJoinRequestOkMessage\",\n" +
"        \"type\": 24319,\n" +
"        \"types\": [],\n" +
"        \"fields\": []\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"AllianceLeaveOkMessage\",\n" +
"        \"type\": 24305,\n" +
"        \"types\": [],\n" +
"        \"fields\": []\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"AllianceListMessage\",\n" +
"        \"type\": 24310,\n" +
"        \"types\": [],\n" +
"        \"fields\": []\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"AllianceMemberMessage\",\n" +
"        \"type\": 24308,\n" +
"        \"types\": [],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"AllianceMemberEntry\",\n" +
"                \"type\": \"?\",\n" +
"                \"register\": \"0x30\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"AllianceMemberRemovedMessage\",\n" +
"        \"type\": 24309,\n" +
"        \"types\": [\n" +
"            \"Long\"\n" +
"        ],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"MemberAvatarId\",\n" +
"                \"type\": \"Long\",\n" +
"                \"register\": \"0x30\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"AskForAllianceDataMessage\",\n" +
"        \"type\": 14302,\n" +
"        \"types\": [\n" +
"            \"Long\"\n" +
"        ],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"AllianceId\",\n" +
"                \"type\": \"Long\",\n" +
"                \"register\": \"0x30\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"AskForJoinableAlliancesListMessage\",\n" +
"        \"type\": 14303,\n" +
"        \"types\": [],\n" +
"        \"fields\": []\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"ChangeAllianceMemberRoleMessage\",\n" +
"        \"type\": 14306,\n" +
"        \"types\": [\n" +
"            \"Long\",\n" +
"            \"Int\"\n" +
"        ],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"NewRole\",\n" +
"                \"type\": \"Int\",\n" +
"                \"register\": \"0x34\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"MemberAvatarId\",\n" +
"                \"type\": \"Long\",\n" +
"                \"register\": \"0x30\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"ChangeAllianceMemberRoleOkMessage\",\n" +
"        \"type\": 24306,\n" +
"        \"types\": [\n" +
"            \"Long\",\n" +
"            \"Int\"\n" +
"        ],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"MemberAvatarId\",\n" +
"                \"type\": \"Long\",\n" +
"                \"register\": \"0x30\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"ChangeAllianceSettingsMessage\",\n" +
"        \"type\": 14316,\n" +
"        \"types\": [],\n" +
"        \"fields\": []\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"CreateAllianceMessage\",\n" +
"        \"type\": 14301,\n" +
"        \"types\": [\n" +
"            \"String\",\n" +
"            \"String\",\n" +
"            \"DataReference\",\n" +
"            \"Int\",\n" +
"            \"Int\"\n" +
"        ],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"AllianceBadgeData\",\n" +
"                \"type\": \"DataReference\",\n" +
"                \"register\": \"0x38\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"AllianceName\",\n" +
"                \"type\": \"String\",\n" +
"                \"register\": \"0x30\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"AllianceDescription\",\n" +
"                \"type\": \"String\",\n" +
"                \"register\": \"0x34\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"AllianceType\",\n" +
"                \"type\": \"Int\",\n" +
"                \"register\": \"0x3C\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"RequiredScore\",\n" +
"                \"type\": \"Int\",\n" +
"                \"register\": \"0x40\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"JoinAllianceMessage\",\n" +
"        \"type\": 14305,\n" +
"        \"types\": [\n" +
"            \"Long\"\n" +
"        ],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"AllianceId\",\n" +
"                \"type\": \"Long\",\n" +
"                \"register\": \"0x30\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"JoinAllianceUsingInvitationMessage\",\n" +
"        \"type\": 14323,\n" +
"        \"types\": [\n" +
"            \"Long\"\n" +
"        ],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"AvatarStreamEntryId\",\n" +
"                \"type\": \"Long\",\n" +
"                \"register\": \"0x30\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"JoinableAllianceListMessage\",\n" +
"        \"type\": 24304,\n" +
"        \"types\": [\n" +
"            \"Int\",\n" +
"            \"Int\"\n" +
"        ],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"JoinableAlliances\",\n" +
"                \"type\": \"Int\",\n" +
"                \"register\": \"0x30\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"KickAllianceMemberMessage\",\n" +
"        \"type\": 14307,\n" +
"        \"types\": [\n" +
"            \"Long\",\n" +
"            \"String\"\n" +
"        ],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"MemberAvatarId\",\n" +
"                \"type\": \"Long\",\n" +
"                \"register\": \"0x30\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"Message\",\n" +
"                \"type\": \"String\",\n" +
"                \"register\": \"0x34\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"KickAllianceMemberOkMessage\",\n" +
"        \"type\": 24307,\n" +
"        \"types\": [\n" +
"            \"Long\"\n" +
"        ],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"MemberAvatarId\",\n" +
"                \"type\": \"Long\",\n" +
"                \"register\": \"0x30\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"LeaveAllianceMessage\",\n" +
"        \"type\": 14308,\n" +
"        \"types\": [],\n" +
"        \"fields\": []\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"RequestJoinAllianceMessage\",\n" +
"        \"type\": 14317,\n" +
"        \"types\": [\n" +
"            \"Long\",\n" +
"            \"String\"\n" +
"        ],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"AllianceId\",\n" +
"                \"type\": \"Long\",\n" +
"                \"register\": \"0x30\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"Message\",\n" +
"                \"type\": \"String\",\n" +
"                \"register\": \"0x34\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"SearchAlliancesMessage\",\n" +
"        \"type\": 14324,\n" +
"        \"types\": [\n" +
"            \"String\"\n" +
"        ],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"SearchString\",\n" +
"                \"type\": \"String\",\n" +
"                \"register\": \"0x30\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"SendAllianceInvitationMessage\",\n" +
"        \"type\": 14322,\n" +
"        \"types\": [\n" +
"            \"Long\"\n" +
"        ],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"AvatarId\",\n" +
"                \"type\": \"Long\",\n" +
"                \"register\": \"0x30\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"SendAllianceMailMessage\",\n" +
"        \"type\": 14330,\n" +
"        \"types\": [\n" +
"            \"Long\",\n" +
"            \"String\"\n" +
"        ],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"AllianceId\",\n" +
"                \"type\": \"Long\",\n" +
"                \"register\": \"0x30\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"Message\",\n" +
"                \"type\": \"String\",\n" +
"                \"register\": \"0x34\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"AskForAvatarProfileMessage\",\n" +
"        \"type\": 14325,\n" +
"        \"types\": [\n" +
"            \"Long\",\n" +
"            \"Long\",\n" +
"            \"Boolean\",\n" +
"            \"Long\",\n" +
"            \"Boolean\"\n" +
"        ],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"AvatarId\",\n" +
"                \"type\": \"Long\",\n" +
"                \"register\": \"0x30\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"AllianceId\",\n" +
"                \"type\": \"Boolean\",\n" +
"                \"register\": \"0x38\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"HomeId\",\n" +
"                \"type\": \"Long\",\n" +
"                \"register\": \"0x34\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"AvatarDataMessage\",\n" +
"        \"type\": 20201,\n" +
"        \"types\": [],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"LogicClientAvatar\",\n" +
"                \"type\": \"?\",\n" +
"                \"register\": \"0x30\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"AvatarNameChangeFailedMessage\",\n" +
"        \"type\": 20205,\n" +
"        \"types\": [\n" +
"            \"Int\"\n" +
"        ],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"Reason\",\n" +
"                \"type\": \"Int\",\n" +
"                \"register\": \"0x30\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"AvatarProfileMessage\",\n" +
"        \"type\": 24334,\n" +
"        \"types\": [],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"AvatarProfileFullEntry\",\n" +
"                \"type\": \"?\",\n" +
"                \"register\": \"0x30\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"ChangeAvatarNameMessage\",\n" +
"        \"type\": 10212,\n" +
"        \"types\": [\n" +
"            \"String\",\n" +
"            \"Boolean\"\n" +
"        ],\n" +
"        \"fields\": []\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"CreateAvatarMessage\",\n" +
"        \"type\": 10200,\n" +
"        \"types\": [\n" +
"            \"String\"\n" +
"        ],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"Name\",\n" +
"                \"type\": \"String\",\n" +
"                \"register\": \"0x30\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"SelectAvatarMessage\",\n" +
"        \"type\": 10201,\n" +
"        \"types\": [\n" +
"            \"Int\",\n" +
"            \"Int\"\n" +
"        ],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"AvatarId\",\n" +
"                \"type\": \"Int\",\n" +
"                \"register\": \"0x30\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"AvatarId\",\n" +
"                \"type\": \"Int\",\n" +
"                \"register\": \"0x30\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"SendChatToAvatarMessage\",\n" +
"        \"type\": 10206,\n" +
"        \"types\": [\n" +
"            \"Int\",\n" +
"            \"Int\",\n" +
"            \"String\"\n" +
"        ],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"RecipientAvatarId\",\n" +
"                \"type\": \"Int\",\n" +
"                \"register\": \"0x30\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"RecipientAvatarId\",\n" +
"                \"type\": \"Int\",\n" +
"                \"register\": \"0x30\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"LogicDeviceLinkCodeDeactivatedMessage\",\n" +
"        \"type\": 26004,\n" +
"        \"types\": [],\n" +
"        \"fields\": []\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"LogicDeviceLinkCodeRequestMessage\",\n" +
"        \"type\": 16000,\n" +
"        \"types\": [],\n" +
"        \"fields\": []\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"LogicDeviceLinkCodeResponseMessage\",\n" +
"        \"type\": 26002,\n" +
"        \"types\": [\n" +
"            \"StringReference\",\n" +
"            \"Int\",\n" +
"            \"Int\"\n" +
"        ],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"LinkCode\",\n" +
"                \"type\": \"StringReference\",\n" +
"                \"register\": \"0x30\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"ErrorCode\",\n" +
"                \"type\": \"Int\",\n" +
"                \"register\": \"0x4C\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"CodeValidSeconds\",\n" +
"                \"type\": \"Int\",\n" +
"                \"register\": \"0x48\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"LogicDeviceLinkConfirmYesMessage\",\n" +
"        \"type\": 16003,\n" +
"        \"types\": [],\n" +
"        \"fields\": []\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"LogicDeviceLinkDoneMessage\",\n" +
"        \"type\": 26007,\n" +
"        \"types\": [\n" +
"            \"StringReference\"\n" +
"        ],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"AccountId\",\n" +
"                \"type\": \"?\",\n" +
"                \"register\": \"0x30\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"PassToken\",\n" +
"                \"type\": \"StringReference\",\n" +
"                \"register\": \"0x38\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"LogicDeviceLinkEnterCodeMessage\",\n" +
"        \"type\": 16002,\n" +
"        \"types\": [\n" +
"            \"StringReference\"\n" +
"        ],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"LinkCode\",\n" +
"                \"type\": \"StringReference\",\n" +
"                \"register\": \"0x30\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"LogicDeviceLinkErrorMessage\",\n" +
"        \"type\": 26008,\n" +
"        \"types\": [\n" +
"            \"Boolean\",\n" +
"            \"Int\"\n" +
"        ],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"AllowBack\",\n" +
"                \"type\": \"Boolean\",\n" +
"                \"register\": \"0x30\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"ErrorCode\",\n" +
"                \"type\": \"Int\",\n" +
"                \"register\": \"0x34\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"LogicDeviceLinkMenuClosedMessage\",\n" +
"        \"type\": 16001,\n" +
"        \"types\": [],\n" +
"        \"fields\": []\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"LogicDeviceLinkNewDeviceLinkedMessage\",\n" +
"        \"type\": 26003,\n" +
"        \"types\": [\n" +
"            \"StringReference\"\n" +
"        ],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"DeviceName\",\n" +
"                \"type\": \"StringReference\",\n" +
"                \"register\": \"0x30\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"LogicDeviceLinkResponseMessage\",\n" +
"        \"type\": 26005,\n" +
"        \"types\": [\n" +
"            \"StringReference\",\n" +
"            \"StringReference\",\n" +
"            \"Int\",\n" +
"            \"Int\",\n" +
"            \"Int\",\n" +
"            \"StringReference\"\n" +
"        ],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"LinkCode\",\n" +
"                \"type\": \"StringReference\",\n" +
"                \"register\": \"0x30\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"VillageName\",\n" +
"                \"type\": \"StringReference\",\n" +
"                \"register\": \"0x54\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"ErrorCode\",\n" +
"                \"type\": \"Int\",\n" +
"                \"register\": \"0x48\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"VillageLevel\",\n" +
"                \"type\": \"Int\",\n" +
"                \"register\": \"0x4C\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"ExpLevel\",\n" +
"                \"type\": \"Int\",\n" +
"                \"register\": \"0x50\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"AccountId\",\n" +
"                \"type\": \"?\",\n" +
"                \"register\": \"0x6C\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"PassToken\",\n" +
"                \"type\": \"StringReference\",\n" +
"                \"register\": \"0x74\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"BindFacebookAccountMessage\",\n" +
"        \"type\": 14201,\n" +
"        \"types\": [\n" +
"            \"Boolean\",\n" +
"            \"String\",\n" +
"            \"String\"\n" +
"        ],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"FacebookId\",\n" +
"                \"type\": \"String\",\n" +
"                \"register\": \"0x30\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"AuthenticationToken\",\n" +
"                \"type\": \"String\",\n" +
"                \"register\": \"0x34\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"Force\",\n" +
"                \"type\": \"Boolean\",\n" +
"                \"register\": \"0x38\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"FacebookAccountAlreadyBoundMessage\",\n" +
"        \"type\": 24202,\n" +
"        \"types\": [\n" +
"            \"String\",\n" +
"            \"Boolean\",\n" +
"            \"Long\",\n" +
"            \"Boolean\",\n" +
"            \"String\"\n" +
"        ],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"AccountId\",\n" +
"                \"type\": \"Boolean\",\n" +
"                \"register\": \"0x38\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"Avatar\",\n" +
"                \"type\": \"?\",\n" +
"                \"register\": \"0x3C\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"FacebookId\",\n" +
"                \"type\": \"String\",\n" +
"                \"register\": \"0x30\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"PassToken\",\n" +
"                \"type\": \"String\",\n" +
"                \"register\": \"0x34\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"FacebookAccountUnboundMessage\",\n" +
"        \"type\": 24214,\n" +
"        \"types\": [],\n" +
"        \"fields\": []\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"UnbindFacebookAccountMessage\",\n" +
"        \"type\": 14211,\n" +
"        \"types\": [],\n" +
"        \"fields\": []\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"AddFriendByAvatarNameAndCodeMessage\",\n" +
"        \"type\": 10509,\n" +
"        \"types\": [\n" +
"            \"String\",\n" +
"            \"String\"\n" +
"        ],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"AvatarName\",\n" +
"                \"type\": \"String\",\n" +
"                \"register\": \"0x30\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"AvatarCode\",\n" +
"                \"type\": \"String\",\n" +
"                \"register\": \"0x34\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"AddFriendByEmailMessage\",\n" +
"        \"type\": 10507,\n" +
"        \"types\": [\n" +
"            \"String\"\n" +
"        ],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"Email\",\n" +
"                \"type\": \"String\",\n" +
"                \"register\": \"0x30\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"AddableFriendsMessage\",\n" +
"        \"type\": 20107,\n" +
"        \"types\": [\n" +
"            \"Int\",\n" +
"            \"Int\"\n" +
"        ],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"FriendEntries\",\n" +
"                \"type\": \"Int\",\n" +
"                \"register\": \"0x30\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"AskForAddableFriendsMessage\",\n" +
"        \"type\": 10503,\n" +
"        \"types\": [\n" +
"            \"Int\",\n" +
"            \"String\",\n" +
"            \"Int\",\n" +
"            \"Int\",\n" +
"            \"String\",\n" +
"            \"Int\"\n" +
"        ],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"FacebookIds\",\n" +
"                \"type\": \"Int\",\n" +
"                \"register\": \"0x30\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"GamecenterIds\",\n" +
"                \"type\": \"Int\",\n" +
"                \"register\": \"0x34\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"AskForPlayingFacebookFriendsMessage\",\n" +
"        \"type\": 10513,\n" +
"        \"types\": [\n" +
"            \"Int\",\n" +
"            \"String\",\n" +
"            \"Int\"\n" +
"        ],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"FacebookIds\",\n" +
"                \"type\": \"Int\",\n" +
"                \"register\": \"0x30\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"AskForPlayingGamecenterFriendsMessage\",\n" +
"        \"type\": 10512,\n" +
"        \"types\": [\n" +
"            \"Int\",\n" +
"            \"String\",\n" +
"            \"Int\"\n" +
"        ],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"GamecenterIds\",\n" +
"                \"type\": \"Int\",\n" +
"                \"register\": \"0x30\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"FriendListMessage\",\n" +
"        \"type\": 20105,\n" +
"        \"types\": [\n" +
"            \"Int\",\n" +
"            \"Int\",\n" +
"            \"Int\"\n" +
"        ],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"ListType\",\n" +
"                \"type\": \"Int\",\n" +
"                \"register\": \"0x34\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"FriendEntries\",\n" +
"                \"type\": \"Int\",\n" +
"                \"register\": \"0x30\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"FriendListUpdateMessage\",\n" +
"        \"type\": 20106,\n" +
"        \"types\": [],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"FriendEntry\",\n" +
"                \"type\": \"?\",\n" +
"                \"register\": \"0x30\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"FriendOnlineStatusMessage\",\n" +
"        \"type\": 20109,\n" +
"        \"types\": [\n" +
"            \"Int\",\n" +
"            \"Long\",\n" +
"            \"Int\"\n" +
"        ],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"OnlineFriendAvatarIds\",\n" +
"                \"type\": \"Int\",\n" +
"                \"register\": \"0x30\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"BindGamecenterAccountMessage\",\n" +
"        \"type\": 14212,\n" +
"        \"types\": [\n" +
"            \"Boolean\",\n" +
"            \"String\"\n" +
"        ],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"GamecenterId\",\n" +
"                \"type\": \"String\",\n" +
"                \"register\": \"0x30\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"Force\",\n" +
"                \"type\": \"Boolean\",\n" +
"                \"register\": \"0x34\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"GamecenterAccountAlreadyBoundMessage\",\n" +
"        \"type\": 24212,\n" +
"        \"types\": [\n" +
"            \"String\",\n" +
"            \"Boolean\",\n" +
"            \"Long\",\n" +
"            \"Boolean\",\n" +
"            \"String\"\n" +
"        ],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"AccountId\",\n" +
"                \"type\": \"Boolean\",\n" +
"                \"register\": \"0x38\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"Avatar\",\n" +
"                \"type\": \"?\",\n" +
"                \"register\": \"0x3C\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"GamecenterId\",\n" +
"                \"type\": \"String\",\n" +
"                \"register\": \"0x30\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"PassToken\",\n" +
"                \"type\": \"String\",\n" +
"                \"register\": \"0x34\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"GlobalChatLineMessage\",\n" +
"        \"type\": 24715,\n" +
"        \"types\": [\n" +
"            \"String\",\n" +
"            \"String\",\n" +
"            \"Int\",\n" +
"            \"Int\",\n" +
"            \"Long\",\n" +
"            \"Long\",\n" +
"            \"Boolean\",\n" +
"            \"Long\",\n" +
"            \"String\",\n" +
"            \"DataReference\",\n" +
"            \"Boolean\"\n" +
"        ],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"Message\",\n" +
"                \"type\": \"String\",\n" +
"                \"register\": \"0x30\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"AvatarName\",\n" +
"                \"type\": \"String\",\n" +
"                \"register\": \"0x34\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"AvatarExpLevel\",\n" +
"                \"type\": \"Int\",\n" +
"                \"register\": \"0x38\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"AvatarLeagueType\",\n" +
"                \"type\": \"Int\",\n" +
"                \"register\": \"0x3C\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"AvatarId\",\n" +
"                \"type\": \"Long\",\n" +
"                \"register\": \"0x40\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"HomeId\",\n" +
"                \"type\": \"Long\",\n" +
"                \"register\": \"0x44\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"AllianceId\",\n" +
"                \"type\": \"Long\",\n" +
"                \"register\": \"0x48\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"AllianceName\",\n" +
"                \"type\": \"String\",\n" +
"                \"register\": \"0x4C\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"AllianceBadgeData\",\n" +
"                \"type\": \"Boolean\",\n" +
"                \"register\": \"0x50\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"SendGlobalChatLineMessage\",\n" +
"        \"type\": 14715,\n" +
"        \"types\": [\n" +
"            \"String\"\n" +
"        ],\n" +
"        \"fields\": []\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"BindGoogleServiceAccountMessage\",\n" +
"        \"type\": 14262,\n" +
"        \"types\": [],\n" +
"        \"fields\": []\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"GoogleServiceAccountAlreadyBoundMessage\",\n" +
"        \"type\": 24262,\n" +
"        \"types\": [\n" +
"            \"String\",\n" +
"            \"Boolean\",\n" +
"            \"Long\",\n" +
"            \"Boolean\",\n" +
"            \"String\"\n" +
"        ],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"AccountId\",\n" +
"                \"type\": \"Boolean\",\n" +
"                \"register\": \"0x38\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"Avatar\",\n" +
"                \"type\": \"?\",\n" +
"                \"register\": \"0x3C\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"GoogleServiceId\",\n" +
"                \"type\": \"String\",\n" +
"                \"register\": \"0x30\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"PassToken\",\n" +
"                \"type\": \"String\",\n" +
"                \"register\": \"0x34\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"AskForTargetHomeListMessage\",\n" +
"        \"type\": 14104,\n" +
"        \"types\": [],\n" +
"        \"fields\": []\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"AttackHomeFailedMessage\",\n" +
"        \"type\": 24103,\n" +
"        \"types\": [\n" +
"            \"Int\",\n" +
"            \"Int\"\n" +
"        ],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"Reason\",\n" +
"                \"type\": \"Int\",\n" +
"                \"register\": \"0x30\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"ProtectionEndSeconds\",\n" +
"                \"type\": \"Int\",\n" +
"                \"register\": \"0x34\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"AttackHomeMessage\",\n" +
"        \"type\": 14106,\n" +
"        \"types\": [\n" +
"            \"Long\",\n" +
"            \"Int\",\n" +
"            \"Long\"\n" +
"        ],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"AttackSource\",\n" +
"                \"type\": \"Int\",\n" +
"                \"register\": \"0x34\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"AvatarStreamEntryId\",\n" +
"                \"type\": \"Long\",\n" +
"                \"register\": \"0x38\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"HomeId\",\n" +
"                \"type\": \"Long\",\n" +
"                \"register\": \"0x30\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"AttackMatchedHomeMessage\",\n" +
"        \"type\": 14123,\n" +
"        \"types\": [],\n" +
"        \"fields\": []\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"AttackNpcMessage\",\n" +
"        \"type\": 14134,\n" +
"        \"types\": [\n" +
"            \"DataReference\"\n" +
"        ],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"NpcData\",\n" +
"                \"type\": \"DataReference\",\n" +
"                \"register\": \"0x30\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"AttackReportListMessage\",\n" +
"        \"type\": 24106,\n" +
"        \"types\": [\n" +
"            \"Int\",\n" +
"            \"Int\"\n" +
"        ],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"AttackReportEntries\",\n" +
"                \"type\": \"Int\",\n" +
"                \"register\": \"0x30\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"AttackResultMessage\",\n" +
"        \"type\": 14101,\n" +
"        \"types\": [],\n" +
"        \"fields\": []\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"AvailableServerCommandMessage\",\n" +
"        \"type\": 24111,\n" +
"        \"types\": [\n" +
"            \"Int\"\n" +
"        ],\n" +
"        \"fields\": []\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"ChangeHomeNameMessage\",\n" +
"        \"type\": 14108,\n" +
"        \"types\": [],\n" +
"        \"fields\": []\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"EndClientTurnMessage\",\n" +
"        \"type\": 14102,\n" +
"        \"types\": [\n" +
"            \"Int\",\n" +
"            \"Int\",\n" +
"            \"Int\",\n" +
"            \"Int\"\n" +
"        ],\n" +
"        \"fields\": []\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"EnemyHomeDataMessage\",\n" +
"        \"type\": 24107,\n" +
"        \"types\": [],\n" +
"        \"fields\": []\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"GoHomeMessage\",\n" +
"        \"type\": 14101,\n" +
"        \"types\": [],\n" +
"        \"fields\": []\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"HomeBattleReplayDataMessage\",\n" +
"        \"type\": 24114,\n" +
"        \"types\": [\n" +
"            \"String\"\n" +
"        ],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"ReplayDataJSON\",\n" +
"                \"type\": \"String\",\n" +
"                \"register\": \"0x30\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"HomeBattleReplayFailedMessage\",\n" +
"        \"type\": 24116,\n" +
"        \"types\": [\n" +
"            \"Int\"\n" +
"        ],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"Reason\",\n" +
"                \"type\": \"Int\",\n" +
"                \"register\": \"0x30\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"HomeBattleReplayMessage\",\n" +
"        \"type\": 14114,\n" +
"        \"types\": [\n" +
"            \"Int\"\n" +
"        ],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"ReplayShardId\",\n" +
"                \"type\": \"Int\",\n" +
"                \"register\": \"0x30\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"ReplayId\",\n" +
"                \"type\": \"?\",\n" +
"                \"register\": \"0x34\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"HomeShareReplayMessage\",\n" +
"        \"type\": 14331,\n" +
"        \"types\": [\n" +
"            \"Long\",\n" +
"            \"String\"\n" +
"        ],\n" +
"        \"fields\": []\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"HomeStatusListMessage\",\n" +
"        \"type\": 24109,\n" +
"        \"types\": [],\n" +
"        \"fields\": []\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"NpcDataMessage\",\n" +
"        \"type\": 24133,\n" +
"        \"types\": [\n" +
"            \"Int\",\n" +
"            \"String\"\n" +
"        ],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"SecondsSinceLastSave\",\n" +
"                \"type\": \"Int\",\n" +
"                \"register\": \"0x30\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"LevelJSON\",\n" +
"                \"type\": \"String\",\n" +
"                \"register\": \"0x34\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"LogicClientAvatar\",\n" +
"                \"type\": null,\n" +
"                \"register\": \"0x38\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"OutOfSyncMessage\",\n" +
"        \"type\": 24104,\n" +
"        \"types\": [\n" +
"            \"Int\",\n" +
"            \"Int\",\n" +
"            \"Int\"\n" +
"        ],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"ServerChecksum\",\n" +
"                \"type\": \"Int\",\n" +
"                \"register\": \"0x30\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"ClientChecksum\",\n" +
"                \"type\": \"Int\",\n" +
"                \"register\": \"0x34\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"Subtick\",\n" +
"                \"type\": \"Int\",\n" +
"                \"register\": \"0x38\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"OwnHomeDataMessage\",\n" +
"        \"type\": 24101,\n" +
"        \"types\": [\n" +
"            \"Int\"\n" +
"        ],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"SecondsSinceLastSave\",\n" +
"                \"type\": \"Int\",\n" +
"                \"register\": \"0x30\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"LogicClientHome\",\n" +
"                \"type\": null,\n" +
"                \"register\": \"0x34\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"ServerErrorMessage\",\n" +
"        \"type\": 24115,\n" +
"        \"types\": [\n" +
"            \"String\"\n" +
"        ],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"ErrorMessage\",\n" +
"                \"type\": \"String\",\n" +
"                \"register\": \"0x30\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"TargetHomeListMessage\",\n" +
"        \"type\": 24105,\n" +
"        \"types\": [\n" +
"            \"Int\",\n" +
"            \"Int\"\n" +
"        ],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"TargetHomeEntries\",\n" +
"                \"type\": \"Int\",\n" +
"                \"register\": \"0x30\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"VisitHomeMessage\",\n" +
"        \"type\": 14113,\n" +
"        \"types\": [\n" +
"            \"Long\"\n" +
"        ],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"HomeId\",\n" +
"                \"type\": \"Long\",\n" +
"                \"register\": \"0x30\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"VisitedHomeDataMessage\",\n" +
"        \"type\": 24113,\n" +
"        \"types\": [\n" +
"            \"Int\",\n" +
"            \"Boolean\",\n" +
"            \"Boolean\"\n" +
"        ],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"SecondsSinceLastSave\",\n" +
"                \"type\": \"Int\",\n" +
"                \"register\": \"0x30\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"LogicClientHome\",\n" +
"                \"type\": null,\n" +
"                \"register\": \"0x34\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"WaitingToGoHomeMessage\",\n" +
"        \"type\": 24112,\n" +
"        \"types\": [\n" +
"            \"Int\"\n" +
"        ],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"EstimatedTimeSeconds\",\n" +
"                \"type\": \"Int\",\n" +
"                \"register\": \"0x30\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"AskForLeagueMemberListMessage\",\n" +
"        \"type\": 14503,\n" +
"        \"types\": [\n" +
"            \"Boolean\",\n" +
"            \"Long\",\n" +
"            \"Boolean\"\n" +
"        ],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"LeagueInstanceId\",\n" +
"                \"type\": \"Boolean\",\n" +
"                \"register\": \"0x30\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"LeagueMemberListMessage\",\n" +
"        \"type\": 24503,\n" +
"        \"types\": [\n" +
"            \"Int\",\n" +
"            \"Int\",\n" +
"            \"Int\"\n" +
"        ],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"LeagueMemberList\",\n" +
"                \"type\": \"Int\",\n" +
"                \"register\": \"0x30\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"NextEndTimeSeconds\",\n" +
"                \"type\": \"Int\",\n" +
"                \"register\": \"0x34\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"MailListMessage\",\n" +
"        \"type\": 20903,\n" +
"        \"types\": [\n" +
"            \"Int\",\n" +
"            \"Int\",\n" +
"            \"Boolean\"\n" +
"        ],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"BoxFull\",\n" +
"                \"type\": \"Boolean\",\n" +
"                \"register\": \"0x34\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"AllianceRankingListMessage\",\n" +
"        \"type\": 24401,\n" +
"        \"types\": [\n" +
"            \"Int\",\n" +
"            \"Int\",\n" +
"            \"Int\",\n" +
"            \"Int\",\n" +
"            \"Int\"\n" +
"        ],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"AllianceRankingList\",\n" +
"                \"type\": \"Int\",\n" +
"                \"register\": \"0x30\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"NextEndTimeSeconds\",\n" +
"                \"type\": \"Int\",\n" +
"                \"register\": \"0x34\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"DiamondPrizes\",\n" +
"                \"type\": \"Int\",\n" +
"                \"register\": \"0x38\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"AskForAllianceRankingListMessage\",\n" +
"        \"type\": 14401,\n" +
"        \"types\": [\n" +
"            \"Boolean\",\n" +
"            \"Long\",\n" +
"            \"Boolean\"\n" +
"        ],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"AllianceId\",\n" +
"                \"type\": \"Boolean\",\n" +
"                \"register\": \"0x30\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"AskForAvatarLocalRankingListMessage\",\n" +
"        \"type\": 14404,\n" +
"        \"types\": [\n" +
"            \"Boolean\",\n" +
"            \"Long\",\n" +
"            \"Boolean\"\n" +
"        ],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"AvatarId\",\n" +
"                \"type\": \"Boolean\",\n" +
"                \"register\": \"0x30\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"AskForAvatarRankingListMessage\",\n" +
"        \"type\": 14403,\n" +
"        \"types\": [\n" +
"            \"Boolean\",\n" +
"            \"Long\",\n" +
"            \"Boolean\"\n" +
"        ],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"AvatarId\",\n" +
"                \"type\": \"Boolean\",\n" +
"                \"register\": \"0x30\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"AvatarLocalRankingListMessage\",\n" +
"        \"type\": 24404,\n" +
"        \"types\": [\n" +
"            \"Int\",\n" +
"            \"Int\"\n" +
"        ],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"AvatarRankingList\",\n" +
"                \"type\": \"Int\",\n" +
"                \"register\": \"0x30\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"AvatarRankingListMessage\",\n" +
"        \"type\": 24403,\n" +
"        \"types\": [\n" +
"            \"Int\",\n" +
"            \"Int\"\n" +
"        ],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"AvatarRankingList\",\n" +
"                \"type\": \"Int\",\n" +
"                \"register\": \"0x30\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"AllianceStreamEntryMessage\",\n" +
"        \"type\": 24312,\n" +
"        \"types\": [\n" +
"            \"Int\"\n" +
"        ],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"StreamEntry\",\n" +
"                \"type\": \"?\",\n" +
"                \"register\": \"0x30\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"AllianceStreamMessage\",\n" +
"        \"type\": 24311,\n" +
"        \"types\": [\n" +
"            \"Int\",\n" +
"            \"Int\",\n" +
"            \"Int\"\n" +
"        ],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"StreamEntries\",\n" +
"                \"type\": \"Int\",\n" +
"                \"register\": \"0x30\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"AskForAllianceStreamMessage\",\n" +
"        \"type\": 14305,\n" +
"        \"types\": [],\n" +
"        \"fields\": []\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"AskForAllianceUnitDonationsMessage\",\n" +
"        \"type\": 14309,\n" +
"        \"types\": [],\n" +
"        \"fields\": []\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"ChatToAllianceStreamMessage\",\n" +
"        \"type\": 14315,\n" +
"        \"types\": [\n" +
"            \"String\"\n" +
"        ],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"Message\",\n" +
"                \"type\": \"String\",\n" +
"                \"register\": \"0x30\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"DonateAllianceUnitMessage\",\n" +
"        \"type\": 14310,\n" +
"        \"types\": [\n" +
"            \"DataReference\",\n" +
"            \"Long\"\n" +
"        ],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"AllianceUnitCharacterData\",\n" +
"                \"type\": \"DataReference\",\n" +
"                \"register\": \"0x30\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"StreamId\",\n" +
"                \"type\": \"Long\",\n" +
"                \"register\": \"0x34\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"RespondToAllianceJoinRequestMessage\",\n" +
"        \"type\": 14321,\n" +
"        \"types\": [\n" +
"            \"Long\",\n" +
"            \"Boolean\"\n" +
"        ],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"StreamId\",\n" +
"                \"type\": \"Long\",\n" +
"                \"register\": \"0x30\"\n" +
"            },\n" +
"            {\n" +
"                \"title\": \"Message\",\n" +
"                \"type\": null,\n" +
"                \"register\": \"0x38\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"AskForAvatarStreamMessage\",\n" +
"        \"type\": 14405,\n" +
"        \"types\": [],\n" +
"        \"fields\": []\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"AvatarStreamEntryMessage\",\n" +
"        \"type\": 24412,\n" +
"        \"types\": [\n" +
"            \"Int\"\n" +
"        ],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"StreamEntry\",\n" +
"                \"type\": \"?\",\n" +
"                \"register\": \"0x30\"\n" +
"            }\n" +
"        ]\n" +
"    },\n" +
"    {\n" +
"        \"title\": \"AvatarStreamMessage\",\n" +
"        \"type\": 24411,\n" +
"        \"types\": [\n" +
"            \"Int\",\n" +
"            \"Int\",\n" +
"            \"Int\"\n" +
"        ],\n" +
"        \"fields\": [\n" +
"            {\n" +
"                \"title\": \"StreamEntries\",\n" +
"                \"type\": null,\n" +
"                \"register\": \"0x30\"\n" +
"            }\n" +
"        ]\n" +
"    }\n" +
"]";

}
