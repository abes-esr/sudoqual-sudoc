package fr.abes.qualinka.these.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class Misc {

	private static final Logger logger = LoggerFactory.getLogger(Misc.class);

	private Misc() {
	}

	public static boolean genreLitteraire(String genre) {
		switch (genre) {
			case "http://www.sudoc.abes.fr/Fiction_roman":
			case "http://www.sudoc.abes.fr/Theatre":
			case "http://www.sudoc.abes.fr/Essais":
			case "http://www.sudoc.abes.fr/Humour_satire":
			case "http://www.sudoc.abes.fr/Lettres":
			case "http://www.sudoc.abes.fr/Nouvelles":
			case "http://www.sudoc.abes.fr/Poesie":
			case "http://www.sudoc.abes.fr/Discours_art_oratoire":
			case "http://www.sudoc.abes.fr/Livret":
			case "http://www.sudoc.abes.fr/Formes_variees_ou_autres_formes_litteraires":
				return true;
			case "http://www.sudoc.abes.fr/Texte_non_litteraire":
				return false;
			default:
				logger.warn("unknown genre : {}", genre);
				return false;
		}
	}

	public static boolean estThese(String scientificWork) {
		switch (scientificWork) {
			case "http://www.sudoc.abes.fr/TheseDeDoctorat":
				return true;
			case "http://www.sudoc.abes.fr/AutreTravailUniversitaire":
				return false;
			default:
				logger.warn("unknown scientificWork : {}", scientificWork);
				return false;
		}
	}
	
	public static boolean langRoleFilter(String role) {
		switch(role) {
			case "actor": //fr:acteur
			case "adapter": //fr:adaptation
		//	case "animator": //fr:animation
		//	case "annotator": //fr:annotations
		//	case "arranger": //fr:arrangement/réduction
		//	case "artist": //fr:artiste
		//	case "assignee": //fr:nouveau_détenteur_du_privilège
		//	case "associated_name": //fr:nom_associé_à_l'exemplaire
		//	case "auctioneer": //fr:commissaire-priseur
			case "author": //fr:auteur
		//	case "author_in_quotations_or_text_extracts": //fr:auteur_cité
		//	case "author_of_afterword_postface_colophon_etc.": //fr:postface
			case "author_of_dialogue": //fr:dialogues/commentaires
		//	case "author_of_introduction_etc.": //fr:préface
			case "bibliographic_antecedent": //fr:auteur_adapté/précédent
		//	case "binder": //fr:relieur
		//	case "binding_designer": //fr:concepteur_de_la_reliure
		//	case "book_designer": //fr:maquette
		//	case "bookjacket_designer": //fr:conception_de_la_jaquette
		//	case "bookplate_designer": //fr:dessin_de_l'ex-libris
		//	case "bookseller": //fr:libraire
		//	case "calligrapher": //fr:calligraphie
		//	case "carried_out_by_role": //fr:réalisée_par_role
		//	case "cartographer": //fr:cartographie
		//	case "censor": //fr:censeur
		//	case "choral_director": //fr:chef_de_choeur
		//	case "choregrapher": //fr:chorégraphie
		//	case "circus_performer": //fr:artiste_de_cirque
		//	case "collaborator": //fr:collaborateur
		//	case "collector_of_field_material": //fr:collecteur
			case "comedian": //fr:humoriste
		//	case "commentator": //fr:commentaires
		//	case "commentator_for_written_text": //fr:notes
		//	case "compiler": //fr:compilation
		//	case "composer": //fr:musique
		//	case "composer_of_adapted_work": //fr:compositeur_de_l'œuvre_adaptée
		//	case "composer_of_main_musical_work": //fr:compositeur_de_l'œuvre_musicale_principale
		//	case "compositor": //fr:compositeur_typographe
		//	case "conceptor": //fr:idée_originale
		//	case "conductor": //fr:chef_d'orchestre
		//	case "consultant_to_a_project": //fr:consultant
			case "continuator": //fr:auteur(continuateur)
		//	case "copyright_holder": //fr:copyright
			case "corrector": //fr:correcteur(1)
		//	case "curator_of_an_exhibition": //fr:commissaire
		//	case "dancer": //fr:danseur
		//	case "dedicatee": //fr:dédicataire
		//	case "dedicator": //fr:auteur_de_la_dédicace
		//	case "degree-grantor": //fr:organisme_de_soutenance
		//	case "director": //fr:réalisateur/metteur_en_scène/artistique
		//	case "disc_jockey": //fr:DJ
		//	case "distributor": //fr:distributeur
		//	case "donor": //fr:donateur
			case "dubious_author": //fr:auteur_supposé
			case "editor": //fr:éditeur_scientifique
		//	case "engraver": //fr:gravure(1)
		//	case "etcher": //fr:eaux-fortes
		//	case "expert": //fr:expert
		//	case "film_editor": //fr:montage
			case "forger": //fr:faussaire
		//	case "former_owner": //fr:ancien_possesseur
		//	case "founder": //fr:fondateur
		//	case "funder": //fr:mécène
		//	case "graphics_technician": //fr:technicien_graphique
		//	case "honoree": //fr:personne_honorée
		//	case "illuminator": //fr:enluminures
		//	case "illustrator": //fr:illustrations/graphisme
		//	case "impresario": //fr:impresario(production_musicale_et_théâtrale)
		//	case "inscriber": //fr:auteur_de_l'envoi
			case "interviewee": //fr:participant
			case "interviewer": //fr:intervieweur
		//	case "issuing_body": //fr:collectivité_éditrice
			case "lecturer": //fr:conférencier
			case "librettist": //fr:livret
		//	case "licensee": //fr:détenteur_du_privilège
		//	case "licensor": //fr:concesseur
		//	case "lithographer": //fr:lithographe
			case "lyricist": //fr:paroles
		//	case "metal-engraver": //fr:gravure
		//	case "mime_artist": //fr:mime
		//	case "monitor": //fr:contrôleur
		//	case "musician": //fr:instrumentiste
			case "narrator": //fr:voix_parlée
		//	case "opponent": //fr:membre_du_jury
		//	case "organiser_of_meeting": //fr:organisation_du_congrès
		//	case "originator": //fr:créateur
		//	case "other": //fr:fonction_non_precisée
		//	case "papermaker": //fr:fabricant_du_papier
		//	case "patent_applicant": //fr:demandeur(brevet)
		//	case "patent_inventor": //fr:inventeur
		//	case "patentee": //fr:détenteur_du_brevet
		//	case "performer": //fr:exécutant
		//	case "performer_of_research": //fr:centre_de_recherche
			case "phD_student": //fr:doctorant
		//	case "photographer": //fr:photographie
			case "presenter": //fr:présentateur
		//	case "printer": //fr:imprimeur/imprimeur-libraire
		//	case "printer_of_plates": //fr:imprimeur_des_gravures
		//	case "producer": //fr:directeur_de_production
		//	case "production_designer": //fr:scénographe/chef_costumier
		//	case "production_personnel": //fr:accessoiriste
		//	case "programmer": //fr:programmeur
		//	case "project_manager": //fr:chef_de_projet
			case "proof-reader": //fr:correcteur
		//	case "publisher": //fr:éditeur_commercial
			case "publishing_editor": //fr:directeur_de_la_publication
		//	case "puppeteer": //fr:marionnettiste
		//	case "recipient_of_letters": //fr:destinataire
		//	case "record_producer": //fr:producteur_d'enregistrement
		//	case "recording_engineer": //fr:ingénieur_du_son
		//	case "remixer": //fr:remixer
		//	case "research_team_head": //fr:directeur_de_recherches
		//	case "research_team_member": //fr:chercheur
			case "reviewer": //fr:critique
		//	case "rubricator": //fr:rubricateur
			case "scenarist": //fr:scénario
			case "scientific_advisor": //fr:conseiller_scientifique
			case "scribe": //fr:copiste
		//	case "sculptor": //fr:sculpteur
			case "secretary": //fr:rédacteur
		//	case "signer": //fr:signataire
		//	case "singer": //fr:chant(1)
		//	case "sponsor": //fr:commanditaire
		//	case "standards_body": //fr:agence_de_normalisation
		//	case "stunt_performer": //fr:cascadeur
			case "thesis_advisor": //fr:directeur_de_thèse
			case "translator": //fr:traduction
		//	case "type_designer": //fr:dessin_des_caractères_d'imprimerie
		//	case "typographer": //fr:typographe
		//	case "vendor": //fr:vendeur
		//	case "vocalist": //fr:chant
		//	case "wood-engraver": //fr:gravure_sur_bois
		//	case "writer_of_accompanying_material": //fr:auteur_de_la_notice
			return true;
			default : return false;
		}

	}


}
