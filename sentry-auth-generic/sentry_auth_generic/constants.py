from __future__ import absolute_import, print_function

from django.conf import settings


AUTHORIZE_URL = getattr(settings, 'GENERIC_AUTHORIZE_URL', None)

ACCESS_TOKEN_URL = getattr(settings, 'GENERIC_ACCESS_TOKEN_URL', None)

CLIENT_ID = getattr(settings, 'GENERIC_CLIENT_ID', None)

CLIENT_SECRET = getattr(settings, 'GENERIC_CLIENT_SECRET', None)

SCOPE = getattr(settings, 'GENERIC_CLIENT_SCOPE', None)

USER_DETAILS_ENDPOINT = getattr(settings, 'GENERIC_USER_DETAILS_ENDPOINT', None)
