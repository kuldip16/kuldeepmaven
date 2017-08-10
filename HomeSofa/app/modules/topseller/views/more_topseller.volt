<div id="topseller_more">
{% if test2 is not defined %}
    <div>
        TopSeller Function called: {{ function }}
    </div>
{% endif %}

{% if test2 is defined %}
    <div>
        TopSeller 2 Function called: {{ function }}
    </div>
{% endif %}
</div>