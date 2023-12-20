package OriginName.Service;

import lombok.experimental.UtilityClass;
import org.json.JSONException;
import org.json.JSONObject;
@UtilityClass
public class CountryFromCode {

    public static String getCountryFromCode(String code) {
        String jsonCountryCode = "{\n" +
                                 "  \"AF\": \"Afghanistan\",\n" +
                                 "  \"ZA\": \"Afrique du Sud\",\n" +
                                 "  \"AL\": \"Albanie\",\n" +
                                 "  \"DZ\": \"Algérie\",\n" +
                                 "  \"DE\": \"Allemagne\",\n" +
                                 "  \"AD\": \"Andorre\",\n" +
                                 "  \"AO\": \"Angola\",\n" +
                                 "  \"AI\": \"Anguilla\",\n" +
                                 "  \"AQ\": \"Antarctique\",\n" +
                                 "  \"AG\": \"Antigua-et-Barbuda\",\n" +
                                 "  \"AN\": \"Antilles néerlandaises\",\n" +
                                 "  \"SA\": \"Arabie saoudite\",\n" +
                                 "  \"AR\": \"Argentine\",\n" +
                                 "  \"AM\": \"Arménie\",\n" +
                                 "  \"AW\": \"Aruba\",\n" +
                                 "  \"AU\": \"Australie\",\n" +
                                 "  \"AT\": \"Autriche\",\n" +
                                 "  \"AZ\": \"Azerbaïdjan\",\n" +
                                 "  \"BS\": \"Bahamas\",\n" +
                                 "  \"BH\": \"Bahreïn\",\n" +
                                 "  \"BD\": \"Bangladesh\",\n" +
                                 "  \"BB\": \"Barbade\",\n" +
                                 "  \"BY\": \"Bélarus\",\n" +
                                 "  \"BE\": \"Belgique\",\n" +
                                 "  \"BZ\": \"Belize\",\n" +
                                 "  \"BJ\": \"Bénin\",\n" +
                                 "  \"BM\": \"Bermudes\",\n" +
                                 "  \"BT\": \"Bhoutan\",\n" +
                                 "  \"BO\": \"Bolivie\",\n" +
                                 "  \"BA\": \"Bosnie-Herzégovine\",\n" +
                                 "  \"BW\": \"Botswana\",\n" +
                                 "  \"BR\": \"Brésil\",\n" +
                                 "  \"BN\": \"Brunéi Darussalam\",\n" +
                                 "  \"BG\": \"Bulgarie\",\n" +
                                 "  \"BF\": \"Burkina Faso\",\n" +
                                 "  \"BI\": \"Burundi\",\n" +
                                 "  \"KH\": \"Cambodge\",\n" +
                                 "  \"CM\": \"Cameroun\",\n" +
                                 "  \"CA\": \"Canada\",\n" +
                                 "  \"CV\": \"Cap-Vert\",\n" +
                                 "  \"EA\": \"Ceuta et Melilla\",\n" +
                                 "  \"CL\": \"Chili\",\n" +
                                 "  \"CN\": \"Chine\",\n" +
                                 "  \"CY\": \"Chypre\",\n" +
                                 "  \"CO\": \"Colombie\",\n" +
                                 "  \"KM\": \"Comores\",\n" +
                                 "  \"CG\": \"Congo-Brazzaville\",\n" +
                                 "  \"KP\": \"Corée du Nord\",\n" +
                                 "  \"KR\": \"Corée du Sud\",\n" +
                                 "  \"CR\": \"Costa Rica\",\n" +
                                 "  \"CI\": \"Côte d’Ivoire\",\n" +
                                 "  \"HR\": \"Croatie\",\n" +
                                 "  \"CU\": \"Cuba\",\n" +
                                 "  \"DK\": \"Danemark\",\n" +
                                 "  \"DG\": \"Diego Garcia\",\n" +
                                 "  \"DJ\": \"Djibouti\",\n" +
                                 "  \"DM\": \"Dominique\",\n" +
                                 "  \"EG\": \"Égypte\",\n" +
                                 "  \"SV\": \"El Salvador\",\n" +
                                 "  \"AE\": \"Émirats arabes unis\",\n" +
                                 "  \"EC\": \"Équateur\",\n" +
                                 "  \"ER\": \"Érythrée\",\n" +
                                 "  \"ES\": \"Espagne\",\n" +
                                 "  \"EE\": \"Estonie\",\n" +
                                 "  \"VA\": \"État de la Cité du Vatican\",\n" +
                                 "  \"FM\": \"États fédérés de Micronésie\",\n" +
                                 "  \"US\": \"États-Unis\",\n" +
                                 "  \"ET\": \"Éthiopie\",\n" +
                                 "  \"FJ\": \"Fidji\",\n" +
                                 "  \"FI\": \"Finlande\",\n" +
                                 "  \"FR\": \"France\",\n" +
                                 "  \"GA\": \"Gabon\",\n" +
                                 "  \"GM\": \"Gambie\",\n" +
                                 "  \"GE\": \"Géorgie\",\n" +
                                 "  \"GS\": \"Géorgie du Sud et les îles Sandwich du Sud\",\n" +
                                 "  \"GH\": \"Ghana\",\n" +
                                 "  \"GI\": \"Gibraltar\",\n" +
                                 "  \"GR\": \"Grèce\",\n" +
                                 "  \"GD\": \"Grenade\",\n" +
                                 "  \"GL\": \"Groenland\",\n" +
                                 "  \"GP\": \"Guadeloupe\",\n" +
                                 "  \"GU\": \"Guam\",\n" +
                                 "  \"GT\": \"Guatemala\",\n" +
                                 "  \"GG\": \"Guernesey\",\n" +
                                 "  \"GN\": \"Guinée\",\n" +
                                 "  \"GQ\": \"Guinée équatoriale\",\n" +
                                 "  \"GW\": \"Guinée-Bissau\",\n" +
                                 "  \"GY\": \"Guyana\",\n" +
                                 "  \"GF\": \"Guyane française\",\n" +
                                 "  \"HT\": \"Haïti\",\n" +
                                 "  \"HN\": \"Honduras\",\n" +
                                 "  \"HU\": \"Hongrie\",\n" +
                                 "  \"BV\": \"Île Bouvet\",\n" +
                                 "  \"CX\": \"Île Christmas\",\n" +
                                 "  \"CP\": \"Île Clipperton\",\n" +
                                 "  \"AC\": \"Île de l'Ascension\",\n" +
                                 "  \"IM\": \"Île de Man\",\n" +
                                 "  \"NF\": \"Île Norfolk\",\n" +
                                 "  \"AX\": \"Îles Åland\",\n" +
                                 "  \"KY\": \"Îles Caïmans\",\n" +
                                 "  \"IC\": \"Îles Canaries\",\n" +
                                 "  \"CC\": \"Îles Cocos - Keeling\",\n" +
                                 "  \"CK\": \"Îles Cook\",\n" +
                                 "  \"FO\": \"Îles Féroé\",\n" +
                                 "  \"HM\": \"Îles Heard et MacDonald\",\n" +
                                 "  \"FK\": \"Îles Malouines\",\n" +
                                 "  \"MP\": \"Îles Mariannes du Nord\",\n" +
                                 "  \"MH\": \"Îles Marshall\",\n" +
                                 "  \"UM\": \"Îles Mineures Éloignées des États-Unis\",\n" +
                                 "  \"SB\": \"Îles Salomon\",\n" +
                                 "  \"TC\": \"Îles Turks et Caïques\",\n" +
                                 "  \"VG\": \"Îles Vierges britanniques\",\n" +
                                 "  \"VI\": \"Îles Vierges des États-Unis\",\n" +
                                 "  \"IN\": \"Inde\",\n" +
                                 "  \"ID\": \"Indonésie\",\n" +
                                 "  \"IQ\": \"Irak\",\n" +
                                 "  \"IR\": \"Iran\",\n" +
                                 "  \"IE\": \"Irlande\",\n" +
                                 "  \"IS\": \"Islande\",\n" +
                                 "  \"IL\": \"Israël\",\n" +
                                 "  \"IT\": \"Italie\",\n" +
                                 "  \"JM\": \"Jamaïque\",\n" +
                                 "  \"JP\": \"Japon\",\n" +
                                 "  \"JE\": \"Jersey\",\n" +
                                 "  \"JO\": \"Jordanie\",\n" +
                                 "  \"KZ\": \"Kazakhstan\",\n" +
                                 "  \"KE\": \"Kenya\",\n" +
                                 "  \"KG\": \"Kirghizistan\",\n" +
                                 "  \"KI\": \"Kiribati\",\n" +
                                 "  \"KW\": \"Koweït\",\n" +
                                 "  \"LA\": \"Laos\",\n" +
                                 "  \"LS\": \"Lesotho\",\n" +
                                 "  \"LV\": \"Lettonie\",\n" +
                                 "  \"LB\": \"Liban\",\n" +
                                 "  \"LR\": \"Libéria\",\n" +
                                 "  \"LY\": \"Libye\",\n" +
                                 "  \"LI\": \"Liechtenstein\",\n" +
                                 "  \"LT\": \"Lituanie\",\n" +
                                 "  \"LU\": \"Luxembourg\",\n" +
                                 "  \"MK\": \"Macédoine\",\n" +
                                 "  \"MG\": \"Madagascar\",\n" +
                                 "  \"MY\": \"Malaisie\",\n" +
                                 "  \"MW\": \"Malawi\",\n" +
                                 "  \"MV\": \"Maldives\",\n" +
                                 "  \"ML\": \"Mali\",\n" +
                                 "  \"MT\": \"Malte\",\n" +
                                 "  \"MA\": \"Maroc\",\n" +
                                 "  \"MQ\": \"Martinique\",\n" +
                                 "  \"MU\": \"Maurice\",\n" +
                                 "  \"MR\": \"Mauritanie\",\n" +
                                 "  \"YT\": \"Mayotte\",\n" +
                                 "  \"MX\": \"Mexique\",\n" +
                                 "  \"MD\": \"Moldavie\",\n" +
                                 "  \"MC\": \"Monaco\",\n" +
                                 "  \"MN\": \"Mongolie\",\n" +
                                 "  \"ME\": \"Monténégro\",\n" +
                                 "  \"MS\": \"Montserrat\",\n" +
                                 "  \"MZ\": \"Mozambique\",\n" +
                                 "  \"MM\": \"Myanmar\",\n" +
                                 "  \"NA\": \"Namibie\",\n" +
                                 "  \"NR\": \"Nauru\",\n" +
                                 "  \"NP\": \"Népal\",\n" +
                                 "  \"NI\": \"Nicaragua\",\n" +
                                 "  \"NE\": \"Niger\",\n" +
                                 "  \"NG\": \"Nigéria\",\n" +
                                 "  \"NU\": \"Niue\",\n" +
                                 "  \"NO\": \"Norvège\",\n" +
                                 "  \"NC\": \"Nouvelle-Calédonie\",\n" +
                                 "  \"NZ\": \"Nouvelle-Zélande\",\n" +
                                 "  \"OM\": \"Oman\",\n" +
                                 "  \"UG\": \"Ouganda\",\n" +
                                 "  \"UZ\": \"Ouzbékistan\",\n" +
                                 "  \"PK\": \"Pakistan\",\n" +
                                 "  \"PW\": \"Palaos\",\n" +
                                 "  \"PA\": \"Panama\",\n" +
                                 "  \"PG\": \"Papouasie-Nouvelle-Guinée\",\n" +
                                 "  \"PY\": \"Paraguay\",\n" +
                                 "  \"NL\": \"Pays-Bas\",\n" +
                                 "  \"PE\": \"Pérou\",\n" +
                                 "  \"PH\": \"Philippines\",\n" +
                                 "  \"PN\": \"Pitcairn\",\n" +
                                 "  \"PL\": \"Pologne\",\n" +
                                 "  \"PF\": \"Polynésie française\",\n" +
                                 "  \"PR\": \"Porto Rico\",\n" +
                                 "  \"PT\": \"Portugal\",\n" +
                                 "  \"QA\": \"Qatar\",\n" +
                                 "  \"HK\": \"R.A.S. chinoise de Hong Kong\",\n" +
                                 "  \"MO\": \"R.A.S. chinoise de Macao\",\n" +
                                 "  \"QO\": \"régions éloignées de l’Océanie\",\n" +
                                 "  \"CF\": \"République centrafricaine\",\n" +
                                 "  \"CD\": \"République démocratique du Congo\",\n" +
                                 "  \"DO\": \"République dominicaine\",\n" +
                                 "  \"CZ\": \"République tchèque\",\n" +
                                 "  \"RE\": \"Réunion\",\n" +
                                 "  \"RO\": \"Roumanie\",\n" +
                                 "  \"GB\": \"Royaume-Uni\",\n" +
                                 "  \"RU\": \"Russie\",\n" +
                                 "  \"RW\": \"Rwanda\",\n" +
                                 "  \"EH\": \"Sahara occidental\",\n" +
                                 "  \"BL\": \"Saint-Barthélémy\",\n" +
                                 "  \"KN\": \"Saint-Kitts-et-Nevis\",\n" +
                                 "  \"SM\": \"Saint-Marin\",\n" +
                                 "  \"MF\": \"Saint-Martin\",\n" +
                                 "  \"PM\": \"Saint-Pierre-et-Miquelon\",\n" +
                                 "  \"VC\": \"Saint-Vincent-et-les Grenadines\",\n" +
                                 "  \"SH\": \"Sainte-Hélène\",\n" +
                                 "  \"LC\": \"Sainte-Lucie\",\n" +
                                 "  \"WS\": \"Samoa\",\n" +
                                 "  \"AS\": \"Samoa américaines\",\n" +
                                 "  \"ST\": \"Sao Tomé-et-Principe\",\n" +
                                 "  \"SN\": \"Sénégal\",\n" +
                                 "  \"RS\": \"Serbie\",\n" +
                                 "  \"CS\": \"Serbie-et-Monténégro\",\n" +
                                 "  \"SC\": \"Seychelles\",\n" +
                                 "  \"SL\": \"Sierra Leone\",\n" +
                                 "  \"SG\": \"Singapour\",\n" +
                                 "  \"SK\": \"Slovaquie\",\n" +
                                 "  \"SI\": \"Slovénie\",\n" +
                                 "  \"SO\": \"Somalie\",\n" +
                                 "  \"SD\": \"Soudan\",\n" +
                                 "  \"LK\": \"Sri Lanka\",\n" +
                                 "  \"SE\": \"Suède\",\n" +
                                 "  \"CH\": \"Suisse\",\n" +
                                 "  \"SR\": \"Suriname\",\n" +
                                 "  \"SJ\": \"Svalbard et Île Jan Mayen\",\n" +
                                 "  \"SZ\": \"Swaziland\",\n" +
                                 "  \"SY\": \"Syrie\",\n" +
                                 "  \"TJ\": \"Tadjikistan\",\n" +
                                 "  \"TW\": \"Taïwan\",\n" +
                                 "  \"TZ\": \"Tanzanie\",\n" +
                                 "  \"TD\": \"Tchad\",\n" +
                                 "  \"TF\": \"Terres australes françaises\",\n" +
                                 "  \"IO\": \"Territoire britannique de l'océan Indien\",\n" +
                                 "  \"PS\": \"Territoire palestinien\",\n" +
                                 "  \"TH\": \"Thaïlande\",\n" +
                                 "  \"TL\": \"Timor oriental\",\n" +
                                 "  \"TG\": \"Togo\",\n" +
                                 "  \"TK\": \"Tokelau\",\n" +
                                 "  \"TO\": \"Tonga\",\n" +
                                 "  \"TT\": \"Trinité-et-Tobago\",\n" +
                                 "  \"TA\": \"Tristan da Cunha\",\n" +
                                 "  \"TN\": \"Tunisie\",\n" +
                                 "  \"TM\": \"Turkménistan\",\n" +
                                 "  \"TR\": \"Turquie\",\n" +
                                 "  \"TV\": \"Tuvalu\",\n" +
                                 "  \"UA\": \"Ukraine\",\n" +
                                 "  \"EU\": \"Union européenne\",\n" +
                                 "  \"UY\": \"Uruguay\",\n" +
                                 "  \"VU\": \"Vanuatu\",\n" +
                                 "  \"VE\": \"Venezuela\",\n" +
                                 "  \"VN\": \"Viêt Nam\",\n" +
                                 "  \"WF\": \"Wallis-et-Futuna\",\n" +
                                 "  \"YE\": \"Yémen\",\n" +
                                 "  \"ZM\": \"Zambie\",\n" +
                                 "  \"ZW\": \"Zimbabwe\",\n" +
                                 "}";
        JSONObject jsonObject = new JSONObject(jsonCountryCode);
        String country;
        try {
            country = jsonObject.getString(code);
        } catch (JSONException e) {
            country = code;       // if the country code is not in the list
        }

        return country;

    }
}

