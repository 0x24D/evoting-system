package evotingsystem

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
        "/vote"(view:"/vote")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
