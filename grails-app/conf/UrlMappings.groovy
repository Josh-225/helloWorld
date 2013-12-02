class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.${format})?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(controller:'helloWorld', action:'index')
        "500"(view:'/error')
	}
}
