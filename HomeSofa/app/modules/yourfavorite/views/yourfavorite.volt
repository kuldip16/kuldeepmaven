{% if test2 is not defined %}
    <div>
        YourFavorite Function called: {{ function }}
    </div>
{% endif %}

{% if test2 is defined %}
    <div>
        YourFavorite 2 Function called: {{ function }}
    </div>
{% endif %}
