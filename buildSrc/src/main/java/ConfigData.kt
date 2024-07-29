/**
 * Created by Thulasi Rajan P on 28/07/24.
 */
object ConfigData {

	/**
	 * Library publishing info for jitpack.io
	 * */
	interface PublishingData {
		companion object {
			const val GROUP_ID = "com.genius.jitpacklibrary_module"
			const val ARTIFACT_ID = "utils"
			const val ARTIFACT_NAME = "utils-release.aar"
			const val ARTIFACT_PATH = "../utils/build/outputs/aar/$ARTIFACT_NAME"
			const val RELEASE_VERSION = "0.0.1"
		}
	}

	/**
	 * Library publication info
	 * */
	interface PublicationData {
		companion object {
			const val PUBLISHER_NAME = "Thulasi rajan P"
			const val PUBLISHER_URL = "https://itsgenius.github.io"
			const val PUBLISHER_DESCRIPTION = "Senior Android Developer"
		}
	}

	/**
	 * Library author information
	 * */
	interface PublisherData {
		companion object {
			const val AUTHOR_NAME = "Thulasi Rajan P"
			const val AUTHOR_EMAIL = "thulcgenius@gmail.com"
			const val AUTHOR_PORTFOLIO = "https://itsgenius.github.io/"
		}
	}
}
