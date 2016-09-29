<%--<link href="http://cdn.jsdelivr.net/webjars/bootstrap/3.3.4/css/bootstrap.min.css"
      href="@{/webjars/bootstrap/3.3.4/css/bootstrap.min.css}"
      rel="stylesheet" media="screen" />--%>

<script src="http://cdn.jsdelivr.net/webjars/jquery/2.1.4/jquery.min.js"></script>
<%--<script src="@{/webjars/jquery/2.1.4/jquery.min.js}"></script>--%>

<%--<script   src="https://code.jquery.com/jquery-3.1.1.min.js"
          integrity="sha256-hVVnYaiADRTO2PzUGmuLJr8BLUSjGIZsDYGmIJLv2b8="
          crossorigin="anonymous"></script>--%>
<%--<script type="text/javascript" src="js/jquery/jquery-3.1.1.js"></script>--%>
<script type="text/javascript" src="/bootstrap/js/bootstrap.min.js"></script>
<script>
    $(document).ready(function () {
        $('ul.nav li.dropdown').hover(function(){
                    $('.dropdown-menu', this).fadeIn();
                }, function() {
                    $('.dropdown-menu', this).fadeOut('fast');
                }
        )
    })

</script>

<link href="/bootstrap/css/bootstrap.min.css" rel="stylesheet" media="screen"/>