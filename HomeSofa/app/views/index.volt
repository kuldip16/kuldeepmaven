<!DOCTYPE html>
<html>
    <head>
        {{ headTopHook is not empty ? headTopHook : '' }}
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
        {{ headMetaHook is not empty ? headMetaHook : '' }}
        {# The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags #}
        <title>RTB Core Shop Frontoffice</title>           
        {{ headCssHook is not empty ? headCssHook : '' }}
        <link rel="stylesheet" href="//idangero.us/swiper/dist/css/swiper.css">
        <link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">        
        {{ headJsHook is not empty ? headJsHook : '' }}
        {{ headBottomHook is not empty ? headBottomHook : '' }}
        {{ assets.outputCss() }}
    </head>
    <body class = {{pageName}}>
        {{ bodyTopHook is not empty ? bodyTopHook : '' }}        
        {{ accessDeniedMsg }}       
        {% include "partials/header.volt" %}
        <div class="clear"></div>
        <div class="module pre-content-hook">
            {{ preContentHook is not empty ? preContentHook : '' }}
        </div>        
        <div class="container">
            {{ content() }}
        </div>   
        <div class="clear"></div>
        <div class="module post-content-hook">
            {{ postContentHook is not empty ? postContentHook : '' }}
        </div>        
        <div class="clear"></div>
        {% include "partials/footer.volt" %}        
        {% include "partials/globalvar.volt" %}                
        {# jQuery (necessary for Bootstrap's JavaScript plugins) #}
        <script   src="//code.jquery.com/jquery-3.1.0.min.js" integrity="sha256-cCueBR6CsyA4/9szpPfrX3s49M9vUU5BgtiJj06wt/s=" crossorigin="anonymous"></script>        
        {# Latest compiled and minified JavaScript #}
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        {{ bodyJsHook is not empty ? bodyJsHook : '' }}
        {{ assets.outputJs() }}        
        <script src="//idangero.us/swiper/dist/js/swiper.min.js"></script>
        <link rel="stylesheet" href="//code.jquery.com/ui/1.12.0/themes/smoothness/jquery-ui.css">
        <script src="//code.jquery.com/ui/1.12.0/jquery-ui.js"></script>
        <script type="text/javascript" src="//cdnjs.cloudflare.com/ajax/libs/jqueryui-touch-punch/0.2.3/jquery.ui.touch-punch.min.js"></script>
        <script src="{{sharedData['baseUri']}}assets/js/jquery.validate.js"></script>
        <script src="{{sharedData['baseUri']}}assets/js/custom-plugins.js"></script>
        <script src="{{sharedData['baseUri']}}assets/js/common.js"></script>
        <script src="{{sharedData['baseUri']}}assets/js/index.js"></script>        
        {{ bodyBottomHook is not empty ? bodyBottomHook : '' }}                
    </body>
</html>
